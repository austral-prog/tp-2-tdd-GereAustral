package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    private final RomanNumerals converter = new RomanNumerals();

    @Test
    public void convert1ToI() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void convert4ToIV() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    public void convert5ToV() {
        assertEquals("V", converter.convert(5));
    }

    @Test
    public void convert9ToIX() {
        assertEquals("IX", converter.convert(9));
    }
//
    @Test
    public void convert10ToX() {
        assertEquals("X", converter.convert(10));
    }

    @Test
    public void convert40ToXL() {
        assertEquals("XL", converter.convert(40));
    }

    @Test
    public void convert50ToL() {
        assertEquals("L", converter.convert(50));
    }

    @Test
    public void convert90ToXC() {
        assertEquals("XC", converter.convert(90));
    }

    @Test
    public void convert100ToC() {
        assertEquals("C", converter.convert(100));
    }

    @Test
    public void convert400ToCD() {
        assertEquals("CD", converter.convert(400));
    }

    @Test
    public void convert500ToD() {
        assertEquals("D", converter.convert(500));
    }

    @Test
    public void convert900ToCM() {
        assertEquals("CM", converter.convert(900));
    }

    @Test
    public void convert1000ToM() {
        assertEquals("M", converter.convert(1000));
    }

    @Test
    public void convert1994ToMCMXCIV() {
        assertEquals("MCMXCIV", converter.convert(1994));
    }

    @Test
    public void convert0ShouldBeInvalid() {
        assertEquals("Invalid Roman Numeral", converter.convert(0));
    }

    @Test
    public void convertNegativeShouldBeInvalid() {
        assertEquals("Invalid Roman Numeral", converter.convert(-5));
    }

    @Test
    public void convert4000ShouldBeInvalid() {
        assertEquals("Invalid Roman Numeral", converter.convert(4000));
    }
}
