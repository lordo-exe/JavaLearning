package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        // Hello World - lordo.exe
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
        System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long daysCalc = minutes / 1440;
            long days = daysCalc % 365;
            long years = daysCalc / 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
