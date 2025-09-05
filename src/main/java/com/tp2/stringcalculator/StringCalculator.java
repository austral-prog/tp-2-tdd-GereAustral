package com.tp2.stringcalculator;

public class StringCalculator {

    public int Calculator(String numbers) {
        int suma = 0;
        String[] partes = numbers.split("[,\n]");


        if (numbers.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < partes.length; i++) {
            int numeros = Integer.parseInt(partes[i]);

            if (numeros < 0) {
                throw new IllegalArgumentException("Negative numbers not allowed: " + numeros);
            }



            suma += numeros;


        }
        return suma;
    }
}

