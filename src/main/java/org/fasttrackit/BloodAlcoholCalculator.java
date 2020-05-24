package org.fasttrackit;
//Create a program that prompts for your weight, gender,
//        number of drinks, the amount of alcohol by volume of the
//        drinks consumed, and the amount of time since your last
//        drink. Calculate your blood alcohol content (BAC) using this
//        formula
//        BAC = (A × 5.14 / W × r) − .015 × H

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodAlcoholCalculator {
    public void calculateAlcohol() {
        System.out.println(" Total alcohol consumed  in ml:");
        Scanner scanner = new Scanner(System.in);
        try {
            double alcohol = scanner.nextDouble();
            alcohol = alcohol / 28.57;///formula este in uncii,1uncie alcool= 28.57 ml;in Ro e mai usor de masurat in ml;
            System.out.println("Your weight in ponds :");
            double weight = scanner.nextDouble();
            System.out.println("You are a man?please enter true or false");
            boolean sex = scanner.nextBoolean();
            System.out.println("Number of hours since the last drink:");
            double hours = scanner.nextDouble();
            double r;
            if (sex == true) {
                r = 0.73;
            }
            r = 0.66;
            double BAC = (alcohol * 5.14 / weight * r) - .015 * hours;

            if (BAC >= 0.08) {
                System.out.println("Your BAC is " + BAC + " It is NOT legal for you to drive.");
            } else {
                System.out.println("Your BAC is " + BAC + " It is  legal for you to drive.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter the data corectly");
        }
    }

    public static void main(String[] args) {
        BloodAlcoholCalculator bloodAlcoholCalculator = new BloodAlcoholCalculator();
        bloodAlcoholCalculator.calculateAlcohol();

    }
}
