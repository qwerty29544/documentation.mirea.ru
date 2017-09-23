package ru.mirea.documentation;

        import java.util.Date;
/*
Класс экземпляра документа.
Содержит основные поля, необходимые для работы с различными типами документов.
Максимальный размер = 10 МB
 */
public class Document {
    private String Header;//Заголовок документа
    private String Body;//Текст документа
    private Date DataCreation;//Дата создания документа
    private Date DataEdition;//Дата последнего изменения документа
    private String AuthorID;//Имя пользователя, создавшего или изменившего документ
    private String Type;//Тип или расширение документа. Допускаются .pdf .doc .docx .txt
    private int DocID;//Уникальный номер документа

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
    public String getType(){
        return this.Type;
    }
    //Метод, возвращающий уникальный номер документа
    public int getDocID(){
        return this.DocID;
    }
    //Метод, позволяющий изменить заголовок экземпляра документа
    public void setHeader(String Header){
        this.Header = Header;
    }
    //Метод, позволяющий изменить тело экземпляра документа
    public void setBody(String Body){
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
    public void setType(String Type){
        this.Type = Type;
    }
    //Метод, позволяющий изменить уникальный номер экземпляра документа
    public void setDocID(int DocID){
        this.DocID = DocID;
    }



}

