package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {
    private PasswordValidator passwordvalidator = new PasswordValidator();

    // TODO: Replace these lines with your tests
    @Test
    public void Less8Chars(){
        assertFalse(passwordvalidator.isValid("Vele"));
    }

    @Test
    public void MoreThan8(){
        assertTrue(passwordvalidator.isValid("Pablo1234!"));
    }

    @Test
    public void AlmostOneUpper(){
        assertTrue(passwordvalidator.isValid("Pablo1234!"));
    }

    @Test
    public void AlmostOneLower(){
        assertTrue(passwordvalidator.isValid("Pablo1234!"));
    }
    @Test
    public void AlmostOneNumber(){
        assertTrue(passwordvalidator.isValid("Pablo1234!"));
    }
    @Test
    public void AlmostOneSpecial(){
        assertTrue(passwordvalidator.isValid("Pablo1234!"));
    }
    @Test
    public void passwordMeetingAllCriteria() {
        assertTrue(passwordvalidator.isValid("Pablo1234!"));
    }


//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
