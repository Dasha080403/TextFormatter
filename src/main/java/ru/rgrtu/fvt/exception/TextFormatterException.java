package ru.rgrtu.fvt.exception;

public class TextFormatterException extends RuntimeException {
    public TextFormatterException(String message, Throwable cause) {
        super(message, cause);
    }
//ошибка при форматировании
    public TextFormatterException(String message) {
        super(message);
    }
}
