package org.fasttrackit;
//Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the
//        starting temperature. The program should prompt for the
//        type of conversion and then perform the conversion.
//        The formulas are
//        C = (F − 32) × 5 / 9
//        and
//        F = (C × 9 / 5) + 32

import java.util.Scanner;

public class TemperatureConverter {

    public void convertsTemperature() {

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to  Fahrenheit.");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        if (temp.equalsIgnoreCase("c")) {
            System.out.println("Your choice: C");
            System.out.println("Please enter the temperature in Fahrenheit. ");
            double fah = scanner.nextDouble();
            double result = (fah - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is  " + result);

        } else if (temp.equalsIgnoreCase("f")) {
            System.out.println("Your choice: F");
            System.out.println("Please enter the temperature in Celsius. ");
            double cel = scanner.nextDouble();
            double result = (cel * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is  " + result);

        } else {
            System.out.println("Please enter C or F !");
        }
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.convertsTemperature();

    }
}
