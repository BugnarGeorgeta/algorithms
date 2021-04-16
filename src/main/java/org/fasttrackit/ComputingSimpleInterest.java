package org.fasttrackit;
//Create a program that computes simple interest. Prompt for
//        the principal amount, the rate as a percentage, and the time,
//        and display the amount accrued (principal + interest).
//        The formula for simple interest is
//        A = P(1 + rt), where P is
//        the principal amount, r is the annual rate of interest, t is the
//        number of years the amount is invested, and A is the amount
//        at the end of the investment.
//• Ensure that fractions of a cent are rounded up to the
//next penny.
//In addition to printing out the final amount, print out
//        the amount at the end of each year.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputingSimpleInterest {

    public double calculateInterest() {
        System.out.println("Enter the principal:");
        Scanner scanner = new Scanner(System.in);
        try {
            double principal = scanner.nextDouble();
            System.out.println("Enter the rate of interest:");
            double rate = scanner.nextDouble();
            System.out.println("Enter the number of year:");
            double year = scanner.nextDouble();
            for (int i = 1; i <= year; i++) {
                double investment = Math.ceil(principal * (1 + (rate / 100) * i));
                System.out.println("After " + i + " years at " + rate + "%, the investment will be worth $ " + investment + ".");
            }
            return year;
        } catch (InputMismatchException e) {
            System.out.println("Please enter the data correctly");
            return calculateInterest();
        }
    }

    public static void main(String[] args) {
        ComputingSimpleInterest computingSimpleInterest = new ComputingSimpleInterest();
        computingSimpleInterest.calculateInterest();

    }
}
