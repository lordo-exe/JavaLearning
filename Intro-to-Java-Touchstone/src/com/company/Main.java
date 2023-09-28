package com.company;

// Importing the Scanner utility
import java.util.Scanner;
// Importing import InputMismatchException utility
import java.util.InputMismatchException;

// The main class
class Main {
    public static void main(String[] args) {

        // Getting user input for the deposit
        Scanner depositInput = new Scanner(System.in);

        // Getting user input for the Contribution Amount
        Scanner contriAmountInput = new Scanner(System.in);

        // Getting user input for the Investment Time Span
        Scanner timeSpanInput = new Scanner(System.in);

        // Getting user input for the Compounding Frequency
        Scanner compFreqInput = new Scanner(System.in);

        // Getting user input for the Interest Rate
        Scanner interestRateInput = new Scanner(System.in);

        // Program starting up and welcome Strings
        System.out.println("\n\nWelcome to the last compound interest calculator you'll ever need!\nWritten by: Keril Ivanchuk\n");
        System.out.println("HELPFUL TIP: Compound Frequency is the number of times per year the accumulated interest is paid out on a regular basis.\n");

        // Gathering user input for deposit
        // Setting up values
        double deposit = 0;
        boolean validInput = false;

        // Creating a do-while loop to encompass the entire trial and error process when it comes to getting a value for the deposit. Must be >= 0 and a numeric value
        do {
            try {
                // Prompting the user with a print and input for the deposit
                System.out.println("What's your initial deposit amount: ");
                deposit = depositInput.nextDouble();
                // Checking to see if their input is less than zero
                if (deposit < 0) {
                    // Print for incorrect value, then moves to catch, and finally re-loops through the do-while loop
                    System.out.println("Deposit amount cannot be less than zero. Please enter a non-negative value.\n");
                } else {
                    // If the deposit tested in the if statement is >= 0, then validInput = true, killing the do-while loop
                    validInput = true;
                }
                // Catch to make sure the value entered is a numeric value
            } catch (InputMismatchException e) {
                // Incorrect print, else will re-loop the do-while loop
                System.out.println("Invalid input. Please enter a numeric value.\n");
                depositInput.next();
            }
            // Do-while loop will continue to run until validInput is true
        } while (!validInput);

        // Gathering user input for contriAmount
        // Setting up values
        double contriAmount = 0;
        validInput = false;

        // Creating a do-while loop to encompass the entire trial and error process when it comes to getting a value for the deposit. Must be >= 0 and a numeric value
        do {
            try {
                // Prompting the user with a print and input for the contriAmount
                System.out.println("\nWhat's your contribution amount: ");
                contriAmount = contriAmountInput.nextDouble();
                // Checking to see if their input is less than zero
                if (contriAmount < 0) {
                    // Print for incorrect value, then moves to catch, and finally re-loops through the do-while loop
                    System.out.println("\nContribution amount cannot be less than zero. Please enter a non-negative value.\n");
                } else {
                    // If the contriAmount tested in the if statement is >= 0, then validInput = true, killing the do-while loop
                    validInput = true;
                }
                // Catch to make sure the value entered is a numeric value
            } catch (InputMismatchException e) {
                // Incorrect print, else will re-loop the do-while loop
                System.out.println("Invalid input. Please enter a numeric value.\n");
                depositInput.next();
            }
            // Do-while loop will continue to run until validInput is true
        } while (!validInput);

        // Gathering user input for timeSpan
        // Setting up values
        double timeSpan = 0;
        validInput = false;

        // Creating a do-while loop to encompass the entire trial and error process when it comes to getting a value for the timeSpan. Must be >= 0 and a numeric value
        do {
            try {
                // Prompting the user with a print and input for the timeSpan
                System.out.println("\nHow long will you hold this investment (years): ");
                timeSpan = timeSpanInput.nextDouble();
                // Checking to see if their input is less than zero
                if (timeSpan < 0) {
                    // Print for incorrect value, then moves to catch, and finally re-loops through the do-while loop
                    System.out.println("\nInvestment length cannot be less than zero. Please enter a non-negative value.\n");
                } else {
                    // If the timeSpan tested in the if statement is >= 0, then validInput = true, killing the do-while loop
                    validInput = true;
                }
                // Catch to make sure the value entered is a numeric value
            } catch (InputMismatchException e) {
                // Incorrect print, else will re-loop the do-while loop
                System.out.println("Invalid input. Please enter a numeric value.\n");
                timeSpanInput.next();
            }
            // Do-while loop will continue to run until validInput is true
        } while (!validInput);

        // Gathering user input for timeSpan
        // Setting up values
        String compFreq = "foo";
        validInput = false;

        // Creating a do-while loop to encompass the entire trial and error process when it comes to getting a value for the compFreq. Must be monthly, Monthly, yearly, Yearly, quarterly, or Quarterly
        do {
            try {
                // Prompting the user with a print and input for the compFreq
                System.out.println("\nWhat's your compounding frequency (Ex: monthly): ");
                compFreq = compFreqInput.nextLine().toLowerCase();
                // Checking to see if their input isn't monthly, yearly, quarterly
                if (!compFreq.equals("monthly") && !compFreq.equals("yearly") && !compFreq.equals("quarterly")) {
                    // Print for incorrect value, then moves to catch, and finally re-loops through the do-while loop
                    System.out.println("\nCompound Frequency can only be measured in monthly, yearly, or quarterly. At least for this calculator, please input one of those values.\n");
                } else {
                    // If the compFreq tested in the if statement is a valid value, then validInput = true, killing the do-while loop
                    validInput = true;
                }
                // Catch to make sure the value entered is a numeric value
            } catch (InputMismatchException e) {
                // Incorrect print, else will re-loop the do-while loop
                System.out.println("Invalid input. Please enter a alphabetical value.\n");
                compFreqInput.next();
            }
            // Do-while loop will continue to run until validInput is true
        } while (!validInput);

        // Gathering user input for interestRate
        // Setting up values
        double interestRate = 0;
        validInput = false;

        // Creating a do-while loop to encompass the entire trial and error process when it comes to getting a value for the interestRate. Must be >= 0 and a numeric value
        do {
            try {
                // Prompting the user with a print and input for the interestRate
                System.out.println("\nWhat's your interest rate (Ex: 5% would be .05): ");
                interestRate = interestRateInput.nextDouble();
                // Checking to see if their input is less than zero
                if (interestRate < 0) {
                    // Print for incorrect value, then moves to catch, and finally re-loops through the do-while loop
                    System.out.println("\nInterest rate cannot be less than zero. Please enter a non-negative value.\n");
                } else {
                    // If the timeSpan tested in the if statement is >= 0, then validInput = true, killing the do-while loop
                    validInput = true;
                }
                // Catch to make sure the value entered is a numeric value
            } catch (InputMismatchException e) {
                // Incorrect print, else will re-loop the do-while loop
                System.out.println("Invalid input. Please enter a numeric value.\n");
                timeSpanInput.next();
            }
            // Do-while loop will continue to run until validInput is true
        } while (!validInput);

        //Recap print statements
        System.out.println("\nThank you for your input!\nHere's a quick overview!\n");

        System.out.println("Initial Deposit: " + deposit);

        System.out.println("Contribution Amount: " + contriAmount);

        System.out.println("Investment Length: " + timeSpan);

        System.out.println("Compounding Frequency: " + compFreq);

        System.out.println("Interest Rate: " + interestRate + "\n");

        System.out.println("Calculating data..." + "\n");

        // Values for the final outputs

        // Pulling result calculation from the convertStringToDoubleMethod
        double conversion = convertStringToDouble(compFreq);

        // The final calculation with everything included
        double totalCalc = calculateTotalValue(deposit, contriAmount, interestRate, conversion, timeSpan);
        System.out.println("Your total investment value after " + timeSpan + " years would be:\n" + (float)totalCalc);

        // The total value of the users personal contributions alone
        double contriCalc = deposit + (contriAmount * 12) * timeSpan;
        System.out.println("Your total contribution value alone after " + timeSpan + " years would be:\n" + contriCalc);

        // The total value of the interest accrued
        double compInterestCalc = totalCalc - contriCalc;
        System.out.println("Your accrued investment value alone after " + timeSpan + " years would be:\n" + (float)compInterestCalc);

        System.out.println("\nThank you for using this program! Good luck and come back soon!\nWritten by: Keril Ivanchuk\n");

    }
    // This is a method to convert the compFreq String into a double that will work in the formula
    public static double convertStringToDouble(String compFreq) {
        double result = 0;

        switch (compFreq) {
            case "monthly":
                result = 12;
                break;
            case "yearly":
                result = 1;
                break;
            case "quarterly":
                result = 4;
                break;
            default:
                throw new IllegalArgumentException("Invalid string value: " + compFreq);
        }
        return result;
    }
    // This is a method that does the entire calculation, better and easier to call a method
    public static double calculateTotalValue(double p, double PMT, double r, double n, double t) {
        double step1 = Math.pow(1 + r/n, n*t);
        double finalValue = p * step1 + PMT * ((step1 - 1) / (r/n));
        return finalValue;
    }

}