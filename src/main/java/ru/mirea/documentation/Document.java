package ru.mirea.documentation;

        import java.util.Date;
/*
Класс экземпляра документа.
Содержит основные поля, необходимые для работы с различными типами документов.
Максимальный размер = 10 МB
 */
public class Document {
    private String name;//Имя документа (От Димы)
    private String Header;//Заголовок документа (От Димы)
    private String Body;//Текст документа (От Димы)
    private Date DataCreation;//Дата создания документа (Гуглить)
    private Date DataEdition;//Дата последнего изменения документа (Гуглить)
    private String AuthorID;//Имя пользователя, создавшего или изменившего документ (20 байт)
    private DocumentType Type;//Тип или расширение документа. Допускаются .pdf .doc .docx .txt (10 байт)
    private int DocID;//Уникальный номер документа (30 байт)
    private byte[] content;//бинарное наполнение документа

    //Метод, возвращающий значение заголовка
    public String getHeader(){
        return this.Header;
    }
    //Метод, возвращающий значение тела документа
    public String getBody(){
        return this.Body;
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
    public String getUserID(){
        return this.AuthorID;
    }
    //Метод, возвращающий тип или расширение документа
   /*
    public enum getType(){

        return this.Type;
    }
    */
    //Метод, возвращающий уникальный номер документа
    public int getDocID(){
        return this.DocID;
    }
    //Метод, позволяющий изменить заголовок экземпляра документа
    public void setHeader(String Header){
        if ( Header.length() > 200 ) throw new RunTimeException("Header is too long");
        this.Header = Header;
    }


    //Метод, позволяющий изменить тело экземпляра документа
    public void setBody(String Body){
        if ( Body.length() > 10000 )
        this.Body = Body;
    }
    //Метод, позволяющий изменить дату создания экземпляра документа
    public void setDataCreation(Date DataCreation){
        this.DataCreation = DataCreation;
    }
    //Метод, позволяющий изменить дату изменения экземпляра документа
    public void setDataEdition(Date DataEdition){
        this.DataEdition = DataEdition;
    }
    //Метод, позволяющий изменить уникальный номер пользователя, последний раз изменившего или создавшего документ
    public void setUserID(String AuthorID){
        this.AuthorID = AuthorID;
    }
    //Метод, поозволяющий изменить тип или расширение экземпляра документа
    /*public void setType(String Type){
        this.Type = Type;
    }
    */
    //Метод, позволяющий изменить уникальный номер экземпляра документа
    public void setDocID(int DocID){
        this.DocID = DocID;
    }



}

