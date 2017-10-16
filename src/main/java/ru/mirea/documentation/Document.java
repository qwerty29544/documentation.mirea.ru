package ru.mirea.documentation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Date;
import java.util.Map;


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
    private Map<String,String> Header;// Заголовок документа. Реализован с помощью карты заголовков (Обязательно сеттер и геттер) (Изменяемый)
    private byte[] Body;//бинарное наполнение(Изменяемый)

    //метод прибавления единички к последнему числу в файле
    public static int PlusOne(int number){
        number=number+1;
        return number;
    }

    //добавить метод для setHeader set

    public Date getDataCreation(){
        return this.DataCreation;
    }//Метод, возвращающий значение даты создания документа

    public Date getDataEdition(){return this.DataEdition; }//Метод, возвращающий значение даты последнего изменения документа

    public int getAuthorID(){ return this.AuthorID;  }//Метод, возвращающий имя пользователя, создавшего или изменившего документ

    public String getName(){
        return this.Name;
    }//Метод, реализующий получение имени документа

    public int getDocID(){
        return this.DocID;
    }//Метод, возвращающий уникальный номер документа

    public byte[] getBody(){
        return this.Body;
    }//Метод, возвращающий текст документа

    public Map<String, String> getHeader() {
        return this.Header;
    } //Метод, позволяющий получить заголовок документа

    public void setBody(byte[] body){
        this.Body = body;
        this.DataEdition = new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, позволяющий изменить тело экземпляра документа

    public void setAuthorID(int userID){
        this.AuthorID=userID;
        this.DataEdition=new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, позволяющий изменить уникальный номер пользователя, последний раз изменившего или создавшего документ

    public void setType(DocumentType type) {
        this.Type = type;
        this.DataEdition=new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, поозволяющий изменить тип или расширение экземпляра документа

    public void setName(String name){
        this.Name = name;
        this.DataEdition=new Date();//поскольку сеттер, по-сути изменяет поле экземпляра документа, следовательно изменятся и сам документ
    }//Метод, позволяющий изменить имя документа

    /**
     * Из-за Кривого Архитектора, к сожалению, конструктор документа не умеет сразу запихивать внутрь текст и заголовок сразу
     * Не знаю, хорошо ли это или нет
     * Могу сказать точно одно: Это добавляет немного изворотливости, но при кодинге будет легко запутаться
     * Написал сие Иван Юрченков це "Кривой Архитектор"
     * Constructor of document that creates new fields: Type, AuthorID, Name, DataCreation, DataEdition, Body, Header, DocID.
     * My apologize, but Header and Body after they are constructed are still empty
     * You might use methods: setBody and setHeader for fill them;
     * @param type - type of new document
     * @param userID - unique number of user
     * @param name - name of document
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
        this.Header = null; // создание пустого заголовка
        int Number;
        String File_Name = "DocID container.txt";
        try {
            if (!new File(File_Name).exists()) {
                FileWriter FrContainer = new FileWriter(File_Name, true);
                FrContainer.write("10000");
                FrContainer.close();
            }
        } catch (IOException e) {
        }
        try {       //здесь присваиваем number последнее число
            FileReader fr = new FileReader(File_Name);
            String Snumber = null;
            fr.read(CharBuffer.wrap(Snumber));
            Number = Integer.parseInt(Snumber);
            PlusOne(Number);    //метод, увеличивающий number на 1
            fr.close();
            FileWriter fw = new FileWriter(File_Name, true);
            fw.write(Number + "\n");
            fw.close();
        } catch (IOException e) {
        }
    }
}

