package org.fasttrackit;
//You’ll often write programs that deal with numbers. And
//        depending on the programming language you use, you’ll
//        have to convert the inputs you get to numerical data types.
//        Write a program that prompts for two numbers. Print the
//        sum, difference, product, and quotient of those numbers
//    Revise the program to ensure that inputs are entered as
//numeric values. Don’t allow the user to proceed if the
//value entered is not numeric.
//Don’t allow the user to enter a negative number


import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleMath {

    public int dealNumbers() {
        System.out.println("What is the first  number?:");
        Scanner scanner = new Scanner(System.in);
        try {
            int number1 = scanner.nextInt();
            System.out.println("What is the second number?:");
            int number2 = scanner.nextInt();

            if (number1 < 0 || number2 < 0) {
                throw new IllegalArgumentException("Numbers cannot be negative.");
            }

            int sum = number1 + number2;
            System.out.println(number1 + "+" + number2 + "=" + sum);
            int dif = number1 - number2;
            System.out.println(number1 + "-" + number2 + "=" + dif);
            int multiply = number1 * number2;
            System.out.println(number1 + "*" + number2 + "=" + multiply);
            int div = number1 / number2;
            System.out.println(number1 + "/" + number2 + "=" + div);
            return sum;


        } catch (InputMismatchException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Please introduce  numbers or numbers greater than zero.");
            return dealNumbers();
        }
    }

    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        simpleMath.dealNumbers();

    }
}
