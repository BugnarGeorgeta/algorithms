package org.fasttrackit;
//Create a program that prompts for your weight, gender,
//        number of drinks, the amount of alcohol by volume of the
//        drinks consumed, and the amount of time since your last
//        drink. Calculate your blood alcohol content (BAC) using this
//        formula
//        BAC = (A × 5.14 / W × r) − .015 × H

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodAlcoholCalculator {
    public void calculateAlcohol() {
        System.out.println(" Total alcohol consumed  in ml:");
        Scanner scanner = new Scanner(System.in);
        try {
            double alcohol = scanner.nextDouble();
            alcohol = alcohol / 28.57;///formula este in uncii,1uncie alcool= 28.57 ml;in Ro e mai usor de masurat in ml;
            System.out.println("Your weight in kg :");
            double weight = scanner.nextDouble();//1kg=2.205 pounds
            System.out.println("You are a man?please enter true or false");
            boolean man = scanner.nextBoolean();
            System.out.println("Number of hours since the last drink:");
            double hours = scanner.nextDouble();
            double r;
            if (man) {
                r = 0.73;
            } else {
                r = 0.66;
            }
            double BAC = (alcohol * 5.14 / (weight * 2.205) * r) - .015 * hours;
            DecimalFormat df = new DecimalFormat("#.##");
            double value = Double.parseDouble(df.format(BAC));

            if (value >= 0.08) {
                System.out.println("Your BAC is " + value + " It is NOT legal for you to drive.");
            } else {
                System.out.println("Your BAC is " + value + " It is  legal for you to drive.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter the data correctly");
        }
    }

    public static void main(String[] args) {
        BloodAlcoholCalculator bloodAlcoholCalculator = new BloodAlcoholCalculator();
        bloodAlcoholCalculator.calculateAlcohol();

    }
}
