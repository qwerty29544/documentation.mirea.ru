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
    private Integer AuthorID;//Имя пользователя, создавшего или изменившего документ (Изменяемый)
    private DocumentType Type;//Тип или расширение документа. Допускаются .pdf .doc .docx .txt (10 байт) (Изменяемый)
    private int DocID;//Уникальный номер документа (30 байт) (Неизменяемый)
    private Map<String,String> Header;// Заголовок документа. Реализован с помощью карты заголовков (Обязательно сеттер и геттер) (Изменяемый)
    private byte[] Body;//бинарное наполнение (Обязательно написать сеттер и геттер) (Изменяемый)
    private String AuthorName;//Читабельное имя автора (Изменяемый)
    //Метод, возвращающий значение даты создания документа
    public Date getDataCreation(){

    }
    //Метод, возвращающий значение даты последнего изменения документа
    public Date getDataEdition(){

    }
    //Метод, возвращающий имя пользователя, создавшего или изменившего документ
    public int getAuthorID(){

    }
    //Метод, реализующий получение имени документа
    public String getName(){

    }
    //Метод, возвращающий уникальный номер документа
    public int getUserID(){

    }
    //Метод, позволяющий изменить тело экземпляра документа

    //Метод, позволяющий изменить дату создания экземпляра документа

    //Метод, позволяющий изменить дату изменения экземпляра документа

    //Метод, позволяющий изменить уникальный номер пользователя, последний раз изменившего или создавшего документ

    //Метод, поозволяющий изменить тип или расширение экземпляра документа

    //Метод, позволяющий изменить уникальный номер экземпляра документа


}

