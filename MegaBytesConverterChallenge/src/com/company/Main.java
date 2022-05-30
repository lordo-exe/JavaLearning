package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value"); // making sure the value isn't a negative
        } else { // code will proceed if value is positive
            int result = kiloBytes / 1024; // MB count result
            int remainder = kiloBytes % 1024; // KB's remaining result
            System.out.println(kiloBytes + " KB = " + result + " MB and " + remainder + " KB"); // Printing results
        }
    } // END of printMegaBytesAndKiloBytes Method

}
