package ru.mirea.documentation;

//import java.io.Serializable; для ввода данных в файлы (другой разработчик)

import java.io.*;
import java.util.*;

/*
Класс экземпляра документа.
Содержит основные поля, необходимые для работы с различными типами документов.
Максимальный размер = 10 МB
Проверка данных на размер реализуется суммированием всех полей (кроме заголовка) и сравнением их с заданым значением
*/

public class Document {
    private String Name;//Имя документа (Изменяемый)
    private Date DataCreation;//Дата создания документа (Неизменяемый, только в конструкторе)
    private Date DataEdition;//Дата последнего изменения документа (Неизменяемый извне, задаётся в конструктореб меняется в update)
    private Integer AuthorID;//Код пользователя, создавшего или изменившего документ (Изменяемый)
    private DocumentType Type;//Тип или расширение документа. Допускаются .pdf .doc .docx .txt (10 байт) (Изменяемый)
    private int DocID;//Уникальный номер документа (30 байт) (Неизменяемый)
    private Map<String, String> Header;// Заголовок документа. Реализован с помощью карты заголовков (Обязательно сеттер и геттер) (Изменяемый)
    private byte[] Body;//бинарное наполнение(Изменяемый)

    //метод прибавления единички к последнему числу в файле
    public int PlusOne(int number) {
        number = number + 1;
        return number;
    }
    @Override
    public boolean equals(Object Obj) {
        if (!(Obj instanceof Document)) return false;
        Document N = (Document) Obj;

        if (!Arrays.equals(this.Body, N.Body)) {
            return false;
        }
        //Objects.equals(key, e.getKey())
        if (this.Header == N.Header) {
            return true;
        }
        //Objects.equals()
        if (!Objects.equals(this.DataCreation, N.DataCreation)) {
            return false;
        }
        if (!Objects.equals(this.DataEdition, N.DataCreation)) {
            return false;
        }
        if (!Objects.equals(this.AuthorID, N.AuthorID)) {
            return false;
        }
        //тут все ок
        if (this.Type == N.Type) {
            return true;
        }
        if (this.DocID == N.DocID) {
            return true;
        }
        return false;
    }//сравнение по полям документа


    public Date getDataCreation() {
        return this.DataCreation;
    }//Метод, возвращающий значение даты создания документа

    public Date getDataEdition() {
        return this.DataEdition;
    }//Метод, возвращающий значение даты последнего изменения документа

    public int getAuthorID() {
        return this.AuthorID;
    }//Метод, возвращающий имя пользователя, создавшего или изменившего документ

    public String getName() {
        return this.Name;
    }//Метод, реализующий получение имени документа

    public int getDocID() {
        return this.DocID;
    }//Метод, возвращающий уникальный номер документа

    public byte[] getBody() {
        return this.Body;
    }//Метод, возвращающий текст документа

    public Map<String, String> getHeader() {
        return this.Header;
    } //Метод, позволяющий получить заголовок документа

    public void setBody(byte[] body) {
        this.Body = body;
        this.DataEdition = new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, позволяющий изменить тело экземпляра документа

    public void setAuthorID(int userID) {
        this.AuthorID = userID;
        this.DataEdition = new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, позволяющий изменить уникальный номер пользователя, последний раз изменившего или создавшего документ

    public void setType(DocumentType type) {
        this.Type = type;
        this.DataEdition = new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, поозволяющий изменить тип или расширение экземпляра документа

    public void setName(String name) {
        this.Name = name;
        this.DataEdition = new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, позволяющий изменить имя документа

    public void setHeader(Map<String, String> K) {
        this.Header = K;
        this.DataEdition = new Date();
    }//Метод, позволяющий изменить заголовок

    /**
     * Constructor of document that creates new fields: Type, AuthorID, Name, DataCreation, DataEdition, Body, Header, DocID.
     * My apologize, but Header and Body after they are constructed are still empty
     * You might use methods: setBody and setHeader for fill them;
     *
     * @param type   - type of new document
     * @param userID - unique number of user
     * @param name   - name of document
     * @throws IOException
     */
    //Конструктор документа. Генерирует DocID, Дату создания, Дату изменения. Получает на вход Тип документа, Код пользователя, Имя документа.
    Document(DocumentType type, int userID, String name) throws IOException {
        this.Type = type;//задаём тип извне
        this.AuthorID = userID;//задаём уникальный номер автора извне
        this.Name = name;//задаём имя документа извне
        this.DataCreation = new Date();//реализация автоматического задания сегодняшней даты
        this.DataEdition = new Date();//реализация автоматического задания сегодняшней даты
        this.Body = null; // создание пустого тела
        this.Header = new HashMap<>(); // создание пустого заголовка
        int Number = 0;
        String File_Name = "DocID container.txt";

        if (!new File(File_Name).exists()) {//если документ не существует, все равно идет заполнение, поток не закрывается при выходе из трая
            try (FileWriter FrContainer = new FileWriter(File_Name)) {
                FrContainer.write("10000");//afqk vj;tn cjplfnmcz e;t gjckt ghjdthrb eckjdbz? cltkfnm xthtp nhfq
            }
        }
        try (FileReader fr = new FileReader(File_Name)) {       //здесь присваиваем number последнее число
            BufferedReader bufferedReader = new BufferedReader(fr);
            String Snumber = bufferedReader.readLine();
            Number = Integer.parseInt(Snumber);
            Number = PlusOne(Number);    //метод, увеличивающий number на 1, тут присвоить возвращенное значение или типа того
            try (FileWriter fw = new FileWriter(File_Name)) {
                fw.write(Number + "\n");
            }
        }
    }
}


