package com.example.javaproject2.week7.day29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Game369Test {

    @Test
    void is369() {
        assertEquals("*", Game369.is369(3));
        assertEquals("", Game369.is369(15));
        assertEquals("**", Game369.is369(33));
        assertEquals("***", Game369.is369(333));
        assertEquals("****", Game369.is369(3333));
    }
}