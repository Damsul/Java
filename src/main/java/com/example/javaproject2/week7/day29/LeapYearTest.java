package com.example.javaproject2.week7.day29;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @org.junit.jupiter.api.Test
    void checkLeapYear() {
        assertTrue(LeapYear.checkLeapYear(2020));
        assertFalse(LeapYear.checkLeapYear(1700));
    }

}