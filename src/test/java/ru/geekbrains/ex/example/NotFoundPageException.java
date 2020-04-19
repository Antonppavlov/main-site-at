package ru.geekbrains.ex.example;

public class NotFoundPageException extends RuntimeException {
    public NotFoundPageException() {
    }

    public NotFoundPageException(String message) {
        super(message);
    }
}
