package ru.geekbrains.main.site.at.junit.annotation;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedTestJUnit5Test {

    @RepeatedTest(10)
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}