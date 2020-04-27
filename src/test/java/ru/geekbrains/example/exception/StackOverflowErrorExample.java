package ru.geekbrains.example.exception;

public class StackOverflowErrorExample {
    public static void main(String[] args) {
        example();
    }

    public static int example() {
        return example();
    }
}
