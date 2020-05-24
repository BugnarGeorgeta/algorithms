package org.fasttrackit;
//Write a program that converts currency. Specifically, convert
//        euros to U.S. dollars. Prompt for the amount of money in
//        euros you have, and prompt for the current exchange rate
//        of the euro. Print out the new amount in U.S. dollars.
//        Ensure that fractions of a cent are rounded up to the
//next penny.


import java.util.Scanner;

public class CurrencyConversion {

    public void convertCurrency() {
        System.out.println("How many euros are you exchanging?");
        Scanner scanner = new Scanner(System.in);
        double euro = scanner.nextDouble();
        System.out.println("What is the exchange rate?");
        double rate = scanner.nextDouble();
        double dolar =(euro * rate) / 100;
         double dolarex= Math.ceil((euro * rate) / 100);
        System.out.println(euro + " euros at an exchange rate of " + rate + " is " + dolar +" respectively " +dolarex+" U.S. dollars.");

    }

    public static void main(String[] args) {
        CurrencyConversion currencyConversion = new CurrencyConversion();
        currencyConversion.convertCurrency();

    }


}
