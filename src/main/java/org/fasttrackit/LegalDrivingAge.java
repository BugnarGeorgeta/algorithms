package org.fasttrackit;
//Write a program that asks the userfortheir age and compare
//        it to the legal driving age of eighteen. If the user is sixteen or
//        older, then the program should display “You are old enough
//        to legally drive.” If the user is under sixteen, the program
//        should display “You are not old enough to legally drive.”


import java.util.InputMismatchException;
import java.util.Scanner;

public class LegalDrivingAge {

    public int compareAge() {
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        int age;
        try {
            age = scanner.nextInt();
            if (age >= 18 && age < 80) {
                System.out.println("You are old enough to legally drive");
            } else if (age < 0) {
                System.out.println("Please enter correctly your age.");
            } else if (age >= 80) {
                System.out.println("Sorry, You are too old to drive.");
            } else {
                System.out.println("You are not old enough to legally drive.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter the data correctly");
            return compareAge();

        }
        return age;
    }


    public static void main(String[] args) {
        LegalDrivingAge legalDrivingAge = new LegalDrivingAge();
        legalDrivingAge.compareAge();
    }
}
