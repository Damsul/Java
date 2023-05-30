package com.example.javaproject2.week7.day29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CMathTest {

    @Test
    void isPrime() {
        assertTrue(CMath.isPrime(3));
        assertTrue(CMath.isPrime(7));
        assertFalse(CMath.isPrime(10));
    }

    @Test
    void isPerfectNumber() {
        assertTrue(CMath.isPerfectNumber(6));
        assertTrue(CMath.isPerfectNumber(28));
        assertFalse(CMath.isPerfectNumber(100));
    }

    @Test
    void factors() {
        assertEquals("[1, 2, 4, 8]", CMath.factors(16));
        assertEquals("[1, 2, 4, 5, 10, 20, 25, 50]", CMath.factors(100));
    }
}