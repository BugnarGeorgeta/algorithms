package org.fasttrackit;
//Write a program to compute the value of an investment
//        compounded over time. The program should ask for the
//        starting amount, the number of years to invest, the interest
//        rate, and the number of periods per year to compound.Ensure that fractions of a cent are rounded up to the
//next penny.
//• Ensure that the output is formatted as money.• Ensure that all of the inputs are numeric and that the
//program will not let the user proceed without valid
//inputs.



import java.util.InputMismatchException;
import java.util.Scanner;

public class DeterminingCompoundInterest {

    public void computeValueOfAnInvestment() {
        System.out.println("What is the principal amount?");
        Scanner scanner = new Scanner(System.in);
        try {
            double principal = scanner.nextDouble();
            System.out.println("What is the rate?");
            double rate = scanner.nextDouble();
            System.out.println(" What is the number of years?");
            double year = scanner.nextDouble();
            System.out.println(" What is the number of times the interest is compounded per year? ");
            double yearComp = scanner.nextDouble();

            double result1 = 1 + ((rate / 100) / yearComp);
            double result2 = Math.pow(result1, yearComp * year);
            double compoundInterest = principal * result2;
            int result =(int) Math.ceil(compoundInterest * 100) / 100;

            System.out.println(" $" + principal + " invested at " + rate + "% for " + year
                    + " years compounded " + yearComp + " times per year is $" + result + ".");

        } catch (InputMismatchException e) {
            System.out.println("Please enter the data correctly.");
            computeValueOfAnInvestment();
        }

    }

    public static void main(String[] args) {
        DeterminingCompoundInterest determiningCompoundInterest = new DeterminingCompoundInterest();
        determiningCompoundInterest.computeValueOfAnInvestment();

    }
}
