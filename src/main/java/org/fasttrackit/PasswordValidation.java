package org.fasttrackit;
//Create a simple program that validates user login credentials.
//The program must prompt the user for a username and
//password. The program should compare the password given
//by the user to a known password. If the password matches,
//the program should display “Welcome!” If it doesn’t match,
//the program should display “I don’t know you.Use an if/else statement for this problem.
//• Make sure the program is case sensitive.

import java.util.Scanner;

public class PasswordValidation {


    private void getPassword() {
        System.out.println("HELLO, please enter your password!");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        scanner.close();

        String password = "ABc25";
        if (pass.isEmpty()) {
            System.out.println("Please enter a password!");
        }
        else if (pass.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }

    public static void main(String[] args) {
        PasswordValidation passwordValidation = new PasswordValidation();
        passwordValidation.getPassword();
    }

}
