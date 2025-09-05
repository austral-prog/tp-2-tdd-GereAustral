package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    // TODO: Replace these lines with your tests
    @Test
    public void isLeapYearTest() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2024));

    }

    @Test
    public void isdivisiblefourTest() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isDivisibleFour(2024));
    }

    @Test
    public void isdivisibleHandredTest() {
        LeapYear leapYear = new LeapYear();
        assertFalse(leapYear.isDivisibleHandred(2024));
//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
    }

    @Test
    public void isDivisibleFourHandred() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isDivisibleFourHandred(2024));
    }
}