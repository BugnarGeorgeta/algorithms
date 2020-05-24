package org.fasttrackit;
//Write a simple program to compute the tax on an order
//        amount. The program should prompt for the order amount
//        and the state. If the state is “WI,” then the order must be
//        charged 5.5% tax. The program should display the subtotal,
//        tax, and total for Wisconsin residents but display just the
//        total for non-residents.

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaxCalculator {
    public void computeTax() {
        System.out.println("What is the order amount?");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println("What is the state? ");
        String state = scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("WI")) {
            double subtotal = amount;
            double tax = subtotal * 5.5 / 100;
            double total = subtotal + tax;
            System.out.println("The subtotal is $" + subtotal + " The tax is $" + tax + " The total is $" + total + ".");
        } else {
            double total = amount;
            System.out.println("The total is $" + total + ".");

        }

    }


    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.computeTax();

    }
}
