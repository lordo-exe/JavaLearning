package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.25));

    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long milesResult = (long) Math.round(kilometersPerHour / 1.609);
        return milesResult;
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
