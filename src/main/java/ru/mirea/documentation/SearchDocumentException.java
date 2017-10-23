package ru.mirea.documentation;

/*
Method processes exceptions of:
Document not found 404
 */
public class SearchDocumentException extends Exception {
    public SearchDocumentException(Throwable cause) {
        super(cause);
    }
}
