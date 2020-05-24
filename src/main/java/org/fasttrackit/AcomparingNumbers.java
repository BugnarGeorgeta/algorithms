package org.fasttrackit;
//Write a program that asks for three numbers. Check first to
//        see that all numbers are different. If they’re not different,
//        then exit the program. Otherwise, display the largest number
//        of the three
//• Modify the program so that it asks for ten numbers
//        instead of three.
//        • Modify the program so that it asks for an unlimited
//        number of numbers.

import java.util.InputMismatchException;
import java.util.Scanner;

public class AcomparingNumbers {

    public int comparenumber() {
        int max = 0;
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        try {
            int firstNr = scanner.nextInt();
            System.out.println("Enter the second number:");
            int secondNr = scanner.nextInt();
            System.out.println("Enter the third number:");
            int thirdtNr = scanner.nextInt();
            if (firstNr == secondNr || firstNr == thirdtNr || secondNr == thirdtNr) {
                System.out.println("Please enter another number this number has been entered before");
                return comparenumber();
            }

            if (firstNr > secondNr && firstNr > thirdtNr) {
                max = firstNr;
            } else if (secondNr > firstNr && secondNr > thirdtNr) {
                max = secondNr;
            } else {
                max = thirdtNr;
            }
            System.out.println("The largest number is " + max);

        } catch (InputMismatchException e) {
            System.out.println("Please enter data corectly.");
            comparenumber();
        }
        return max;
    }


    public int compareTenNumbers() {
        int a[] = new int[10];
        int max = 0;
        System.out.println("Enter 10 element:");
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < 10; i++) {
                a[i] = scanner.nextInt();
            }
            max = a[0];
            for (int i = 0; i < 10; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
            System.out.println("Maximum value :" + max);
        } catch (InputMismatchException e) {
            System.out.println("Please enter data corectly.");
            compareTenNumbers();
        }
        return max;
    }


    public int compareNumberInArray() {
        int n;
        int max = 0;
        System.out.println("How many numbers do you want to compare :");
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();
            int a[] = new int[n];
            System.out.println("Enter the element:");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        System.out.println("You enter the same numbers.");
                        compareNumberInArray();

                    }
                }
            }
            max = a[0];
            for (int i = 0; i < n; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
            System.out.println("Maximum value :" + max);
            return max;
        } catch (InputMismatchException e) {
            System.out.println("Please enter data corectly.");

        }
        return max;
    }


    public static void main(String[] args) {
        AcomparingNumbers acomparingNumbers = new AcomparingNumbers();
        acomparingNumbers.compareTenNumbers();
        acomparingNumbers.compareNumberInArray();

    }
}
