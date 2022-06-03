package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear (int year) {
        if (year > 9999 || year < 1) { // Checking if "year" falls within accepted value parameters
            return false;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) { // For true "year" must be divisible by 4,100,and 400
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) { // For true "year" must be divisible by 4 and not 100
            return true;
        }
        return false; // For all other results return false
    } // END of isLeapYear method
}
