package ru.geekbrains.main.site.at.junit.annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestJUnit5Test {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}