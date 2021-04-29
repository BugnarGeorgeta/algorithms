package org.fasttrackit;
//Write a program that converts a number from 1 to 12 to the
//        corresponding month. Prompt for a number and display the
//        corresponding calendar month, with 1 being January and
//        12 being December. For any value outside thatrange, display
//        an appropriate error message.


import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersToNames {


    public void convertNumber() {

        System.out.println("Please enter the number of the month: ");

        try {

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("The name of the month  is January.");
                    break;
                case 2:
                    System.out.println("The name of the month  is February.");
                    break;
                case 3:
                    System.out.println("The name of the month  is March.");
                    break;
                case 4:
                    System.out.println("The name of the month  is April.");
                    break;
                case 5:
                    System.out.println("The name of the month  is May.");
                    break;
                case 6:
                    System.out.println("The name of the month  is June.");
                    break;
                case 7:
                    System.out.println("The name of the month  is July.");
                    break;
                case 8:
                    System.out.println("The name of the month  is August.");
                    break;
                case 9:
                    System.out.println("The name of the month  is September.");
                    break;
                case 10:
                    System.out.println("The name of the month  is October.");
                    break;
                case 11:
                    System.out.println("The name of the month  is November.");
                    break;
                case 12:
                    System.out.println("The name of the month  is December.");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 12.");

            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number between 1 and 12.");
        }

    }

    public static void main(String[] args) {
        NumbersToNames numbersToNames = new NumbersToNames();
        numbersToNames.convertNumber();

    }

}



