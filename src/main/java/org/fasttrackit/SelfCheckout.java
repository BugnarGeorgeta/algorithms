package org.fasttrackit;
//Create a simple self-checkout system. Prompt for the prices
//        and quantities of three items. Calculate the subtotal of the
//        items. Then calculate the tax using a tax rate of 5.5%. Print
//        out the line items with the quantity and total, and then print
//        out the subtotal, tax amount, and total.

import java.util.Scanner;

public class SelfCheckout {
    public void calculateSubtotal() {

        System.out.println("Enter the price of item 1:");
        Scanner scanner = new Scanner(System.in);
        double price1 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        double quantity1 = scanner.nextDouble();
        System.out.println("Enter the price of item 2 :");
        double price2 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        double quantity2 = scanner.nextDouble();
        System.out.println("Enter the price of item 3:");
        double price3 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        double quantity3 = scanner.nextDouble();
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = (subtotal * 5.5) / 100;
        double total = subtotal + tax;
        System.out.println("The subtotatal :  " + subtotal + " Tax is: " + tax + " and total is: " + total + ".");

    }


    public static void main(String[] args) {
        SelfCheckout selfCheckout = new SelfCheckout();
        selfCheckout.calculateSubtotal();

    }
}
