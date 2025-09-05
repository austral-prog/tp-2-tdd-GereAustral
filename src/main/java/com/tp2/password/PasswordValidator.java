package com.tp2.password;

public class PasswordValidator {

    public boolean isValid(String password) {
        String SPECIAL_CHARS = "!@#$%^&*()_+-=[]{};:'\",.<>?/";
        if (password == null || password.isEmpty()) return false;
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
            if (SPECIAL_CHARS.indexOf(c) >= 0) hasSpecial = true;
            if (hasUpper && hasLower && hasDigit && hasSpecial) break;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}