package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println("This is main result = " + areEqualByThreeDecimalPlaces(155.15122, 155.15522));
    }

    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
//        double test1 = y * 1000;
//        int test2 = (int) (x * 1000);
//        System.out.println("This is x = " + test2 + " and this is y = " + test1);

        if ((int) x * 1000 == (int) y * 1000 && x == y) {
            return true;
        }
        return false;
    }
}
