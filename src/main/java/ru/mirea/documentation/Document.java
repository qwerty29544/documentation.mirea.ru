package ru.mirea.documentation;

import java.util.Date;
import java.util.HashMap;
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
    private Date DataEdition;//Дата последнего изменения документа (Изменяемый, также задаётся в конструкторе)
    private Integer AuthorID;//Код пользователя, создавшего или изменившего документ (Изменяемый)
    private DocumentType Type;//Тип или расширение документа. Допускаются .pdf .doc .docx .txt (10 байт) (Изменяемый)
    private int DocID;//Уникальный номер документа (30 байт) (Неизменяемый)
    private Map<String,String> Header;// Заголовок документа. Реализован с помощью карты заголовков (Обязательно сеттер и геттер) (Изменяемый)
    private byte[] Body;//бинарное наполнение(Изменяемый)
    private String AuthorName;//Читабельное имя автора(Изменяемый)
    //Конструктор документа. Генерирует DocID, Дату создания, Дату изменения. Получает на вход Тип документа, Код пользователя, Имя документа.
    Document(DocumentType type, int userID, String name){
        this.Type = type;//задаём тип извне
        this.AuthorID = userID;//задаём уникальный номер автора извне
        this.Name = name;//задаём имя документа извне
        this.DataCreation = new Date();//реализация автоматического задания сегодняшней даты
        this.DataEdition = new Date();//реализация автоматического задания сегодняшней даты
        this.Body = null;//нулевое тело, т.к. его заполнение должно производиться отдельно
        /**
         * Здесь нужно реализовать установку хэш-мапу заголовка кастомного розлива, либо интерфейс даст нам указание кастомных заголовков, либо каким-то образом дать им возможность установить эти заголовки самим
         */
        //this.Header = null;
        /**
         * Здесь хорошо бы создать текстовый документ, сохраняющий последнее сгенерированное число, считывать его каждый раз оттуда и прибавлять при присваивании 1
         */
        //this.DocID
        this.AuthorName = getUserName(userID);//метод из классса пользователей, либо реализовать автозаполнение нулевым полем
    }
    //Метод, возвращающий значение даты создания документа
    public Date getDataCreation(){
        return this.DataCreation;
    }
    //Метод, возвращающий значение даты последнего изменения документа
    public Date getDataEdition(){
        return this.DataEdition;
    }
    //Метод, возвращающий имя пользователя, создавшего или изменившего документ
    public int getAuthorID(){
        return this.AuthorID;
    }
    //Метод, реализующий получение имени документа
    public String getName(){
        return this.Name;
    }
    //Метод, возвращающий уникальный номер документа
    public int getDocID(){
        return this.DocID;
    }
    //Метод, возвращающий текст документа
    public byte[] getBody(){
        return this.Body;
    }
    //Метод, возвращающий читабельное имя автора

    public String getAuthorName(){
        return this.AuthorName;
    }
    //Метод, позволяющий получить заголовок документа

    public Map<String, String> getHeader() {
        return Header;
    }

    //Метод, позволяющий изменить тело экземпляра документа
    public void setBody(byte[] body){
        this.Body = body;
    }
    //Метод, позволяющий изменить уникальный номер пользователя, последний раз изменившего или создавшего документ
    public void setAuthorID(int userID){
        this.AuthorID=userID;
    }
    //Метод, поозволяющий изменить тип или расширение экземпляра документа
    public void setType(DocumentType type){
        this.Type = type;
    }
    //Метод, позволяющий изменить читабельное имя автора документа
    public void setAuthorName(String authorName){
        this.AuthorName = authorName;
    }
    //Метод, позволяющий изменить имя документа
    public void setName(String name){
        this.Name = name;
    }
}

