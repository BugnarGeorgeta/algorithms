package org.fasttrackit;
//You’ll often write programs that deal with numbers. And
//        depending on the programming language you use, you’ll
//        have to convert the inputs you get to numerical data types.
//        Write a program that prompts for two numbers. Print the
//        sum, difference, product, and quotient of those numbers as
//        shown in the example output:

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
            int sum = number1 + number2;
            System.out.println(number1 + "+" + number2 + "=" + sum);
            int dif = number1 - number2;
            System.out.println(number1 + "-" + number2 + "=" + dif);
            int multiply = number1 * number2;
            System.out.println(number1 + "*" + number2 + "=" + multiply);
            int div = number1 / number2;
            if(number1 ==0 || number2 ==0) div=0;
            System.out.println(number1 + "/" + number2 + "=" + div);
            return number1+number2;


        } catch (InputMismatchException e) {
            System.out.println("Please introduce a number:");
            return dealNumbers();

        }
    }

    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        simpleMath.dealNumbers();

    }
}
