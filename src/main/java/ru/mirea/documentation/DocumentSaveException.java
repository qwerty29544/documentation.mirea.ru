package ru.mirea.documentation;

/*
Обрабатывает ошибку сохранения документа: нехватка места, перебор по данным и т.д.
Method processes exceptions:
wraps exceptions from storage
 */

import java.io.IOException;

public class DocumentSaveException extends Exception {
    IOException e;

    public DocumentSaveException() {
        e = new IOException();
    }
}
