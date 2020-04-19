package ru.geekbrains.ex.error;

public class StackOverflowErrorExample {

    public static void main(String[] args) {
        example();
    }

    public static void example(){
        example();
    }
}
