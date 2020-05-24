package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

//
// The “Hello, World” program is the first program you learn
//  to write in many languages, but it doesn’t involve any input.
// So create a program that prompts for your name and prints
//  a greeting using your name.
//
//
public class Hello {
    public String getYourName() {
        System.out.println("Hello, please enter your name:");
        Scanner scanner = new Scanner(System.in);
        try {
            String name = scanner.nextLine();
            System.out.println("Hello " + name + " nice to meet you!");
            return name;
        } catch (InputMismatchException exception) {
            System.out.println("Please enter a valid name:");
            return getYourName();
        }
    }

    public static void main(String[] args) {
        Hello app = new Hello();
        app.getYourName();

    }
}
