package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        // Hello World - lordo.exe
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) { // Checking to make sure the value fits valid parameters
        System.out.println(INVALID_VALUE_MESSAGE); // Constant for printing "Invalid Value"
        } else {
            long daysCalc = minutes / 1440; // Calculating minutes into days
            long days = daysCalc % 365; // Display value for days, only displays the remainder of days no more than 365
            long years = daysCalc / 365; // Years value
            System.out.println(minutes + " min = " + years + " y and " + days + " d"); // Message
        }
    }
}
