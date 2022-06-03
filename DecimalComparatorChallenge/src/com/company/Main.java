package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println("This is main result = " + areEqualByThreeDecimalPlaces(155.155, 155.155));
    }

    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {

        if (x * 1000 == y * 1000) {
      System.out.println("This is x = " + x + " and this is y = " + y);
            return true;
        }
        return false;
    }
}
