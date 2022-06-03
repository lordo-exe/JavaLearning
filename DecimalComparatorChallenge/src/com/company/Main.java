package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        int calcX = (int) (x * 1000); // Moving three numbers past the decimal to the right, then cutting off with int cast
        int calcY = (int) (y * 1000); // Same thing happening here as in line 10

        return calcX == calcY; // Testing if calcX and calcY are equal if so true, otherwise false
    }
}
