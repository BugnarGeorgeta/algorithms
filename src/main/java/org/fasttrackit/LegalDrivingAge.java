package org.fasttrackit;
//Write a program that asks the userfortheir age and compare
//        it to the legal driving age of eighteen. If the user is sixteen or
//        older, then the program should display “You are old enough
//        to legally drive.” If the user is under sixteen, the program
//        should display “You are not old enough to legally drive.”
//        Use a ternary operator to write this program.
//If the user enters a number that’s less than zero or enters
//        non-numeric data, display an error message that asks
//        the user to enter a valid age.


import java.util.InputMismatchException;
import java.util.Scanner;

public class LegalDrivingAge {

    private void compareAge() {
        try {
            System.out.println("What is your age?");
            Scanner scanner = new Scanner(System.in);
            int age;

            age = scanner.nextInt();
            if (age < 0 || age >80) {
                throw new IllegalArgumentException();
            }

            String msg = (age >= 18) ? "You are old enough to legally drive"
                    : "You are not old enough to legally drive.";
            System.out.println(msg);

        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Please enter a valid age, non-negative and below 80");
            compareAge();

        }

    }

    public static void main(String[] args) {
        LegalDrivingAge legalDrivingAge = new LegalDrivingAge();
        legalDrivingAge.compareAge();
    }
}
