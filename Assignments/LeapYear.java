package com.guru;

public class LeapYear {
    public static void main(String[] args) {
        // Que. Input a year and find whether it is a leap year or not.
        int year = 2001;
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}

