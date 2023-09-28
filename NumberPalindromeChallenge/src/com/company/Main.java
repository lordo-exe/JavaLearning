package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome (int number) {
        int reverse = 0; // Setting a value for the reverse number
        int dummyDigit = Math.abs(number); // Creating a value for while loop, forcing the numbers value to be positive
        while (dummyDigit > 0) {
            int lastDigit = dummyDigit % 10; // Creating lastDigit value, then taking dummyDigit and extracting it's last number
            reverse *= 10; // Adding a 0 to the end of the reverse value so numbers can be appended to it
            reverse += lastDigit; // Appending lastDigit value to reverse, this will the final result
            dummyDigit /= 10; // Reducing the last digit of the 'number' value, slowing working it to 0.
        }
        if (reverse == Math.abs(number)) { // Comparing results, Math.abs is forcing a positive value for 'number'
            return true;
        }
        return false;
    }
}