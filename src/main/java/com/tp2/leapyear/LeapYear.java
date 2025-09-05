package com.tp2.leapyear;


public class LeapYear {
    public  boolean isLeapYear(int year){
        if ((year%400 == 0) || (year % 4 == 0 && year%100!=0)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isDivisibleFour(int year){
        if (year%4==0){
            return true;
        }
        return false;

    }
    public boolean isDivisibleHandred(int year){
        boolean result=(year%100==0);
        return result;

    }
    public boolean isDivisibleFourHandred(int year){
        if (year%400 == 0){
            return false;
        }
        return true;

    }

}
