package org.fasttrackit;
//Create a program to calculate the body mass index (BMI)
//        for a person using the person’s height in inches and weight
//        in pounds. The program should prompt the user for weight
//        and height.
//        If the BMI is between 18.5 and 25, display that the person is
//        at a normal weight. If they are out of that range, tell them if
//        they are underweight or overweight and tell them to consult
//        their doctor.

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
    public void calculateBodyMass() {
        try {
            System.out.println("Please enter your height in metres, please use the point :");
            Scanner scanner = new Scanner(System.in);
            double height = scanner.nextDouble();
            System.out.println("Please enter  your weight in kilograms :");
            double weight = scanner.nextDouble();

            if (weight == 0 || height == 0) {
                System.out.println("Please enter the data correctly !");
                calculateBodyMass();
            }

            double result = (weight / (height * height));

            System.out.println("Your BMI is " + result + ".");


            if (result <= 15) {
                System.out.println("Very severely underweight. You should see your doctor.");
            } else if (result >= 16 && result <= 18.5) {
                System.out.println("Underweight. You should see your doctor.");
            } else if (result > 18.5 && result <= 25) {
                System.out.println("You are within the ideal weight range.");
            } else {
                System.out.println(" You are overweight. You should see your doctor .");
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter the correct data.");
            calculateBodyMass();
        }
    }

    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();
        bmiCalculator.calculateBodyMass();

    }
}
