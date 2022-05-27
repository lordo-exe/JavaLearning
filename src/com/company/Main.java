package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            return -1;
        }
        long milesResult = (long) (kilometersPerHour / 1.609);
        return Math.round(milesResult);
    }

}
