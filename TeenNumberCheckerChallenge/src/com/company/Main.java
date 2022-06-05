package com.company;

public class Main {

    public static void main(String[] args) {


    }

    public static boolean hasTeen (int x, int y, int z) {
        return isTeen(x) || isTeen(y) || isTeen(z); // Sending each value to isTeen method to determine if they fit parameters
    }

    public static boolean isTeen (int v) {
        return v >= 13 && v <= 19; // Checking each value if it is within 13-19 range
    }
}
