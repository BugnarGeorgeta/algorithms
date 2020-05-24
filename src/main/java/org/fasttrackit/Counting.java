package org.fasttrackit;
//Create a program that prompts for an input string and displays output that shows the input string and the number of
//        characters the string contains.

import java.util.Scanner;

public class Counting {
    public void countingChar() {
        System.out.println("What is the input string?:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) ;
        int number = input.length();
        System.out.println("Your input have " + number + "  character.");
    }

    public static void main(String[] args) {
        Counting counting = new Counting();
        counting.countingChar();

    }
}
