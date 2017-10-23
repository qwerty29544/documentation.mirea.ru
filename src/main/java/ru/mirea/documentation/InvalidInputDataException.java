package ru.mirea.documentation;
/*
Обрабатывает ошибки неверного введенния данных
 */
public class InvalidInputDataException extends Exception {
    public InvalidInputDataException(Throwable cause) {
        super(cause);
    }
}
