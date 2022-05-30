package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) { // Making sure the hourOfDay value is within parameter
            return false;
        } else if (!barking) { // If dog is not barking, instantly return false
            return false;
        } else return hourOfDay < 8 || hourOfDay > 22;
    } // END of shouldWakeUp method
}
