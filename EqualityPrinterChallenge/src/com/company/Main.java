package com.company;

public class Main {

    public static void main(String[] args) {
        // Hello World - lordo-exe
    }

    public static void printEqual (int x, int y, int z) {

        if (x<0 | y<0 | z<0) {
            System.out.println("Invalid Value"); // Checking to see if all values are 0 or higher
        } else if (x == y && y == z) {
                System.out.println("All numbers are equal"); // Checking to see if all numbers are equal to each other
            } else if (x != y && y != z && z !=x) {
                    System.out.println("All numbers are different"); // Checking to see if all numbers are different
            } else {
            System.out.println("Neither all are equal or different"); // Else, print this
        }
    }
}


