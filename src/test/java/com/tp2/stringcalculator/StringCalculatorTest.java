package com.tp2.stringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    // TODO: Replace these lines with your tests
    private StringCalculator stringCalculator = new StringCalculator();
    @Test
    public void isEmptyTest(){
        assertEquals(0,stringCalculator.Calculator(("")));
    }

    @Test
    public void SingleNumberTest(){
        assertEquals(8,stringCalculator.Calculator(("8")));
    }

    @Test
    public void SumOfTwo(){
        assertEquals(4,stringCalculator.Calculator(("2,2")));
    }

    @Test
    public void SumOfMultiples(){
        assertEquals(5,stringCalculator.Calculator((("2,2,1"))));
    }
    @Test
    public void SeparatedNewLine(){
        assertEquals(6,stringCalculator.Calculator(("1\n2,3")));

    }
    @Test
    public void NegativeNumbers(){
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.Calculator("2,-3,4"));
    }



//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
