package org.fasttrackit;
//Your computer knows what the current year is, which means
//        you can incorporate that into your programs. You just have
//        to figure out how your programming language can provide
//        you with that information.
//        Create a program that determines how many years you have
//        left until retirement and the year you can retire. It should
//        prompt for your current age and the age you want to retire
//        and display the output as shown in the example that follows

import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator {

    public void calculateRetirement() {
        System.out.println("Please enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("What age would you like to retire?");
        int retire = scanner.nextInt();
        int dif = retire - age;
        System.out.println("You have " + dif + " years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("It's " + year + ", so you can retire in " + (year + dif) + ".");
    }

    public static void main(String[] args) {
        RetirementCalculator retirementCalculator = new RetirementCalculator();
        retirementCalculator.calculateRetirement();
    }
}