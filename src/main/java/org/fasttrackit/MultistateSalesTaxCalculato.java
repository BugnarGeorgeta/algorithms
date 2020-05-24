package org.fasttrackit;
//Create a tax calculator that handles multiple states and
//        multiple counties within each state. The program prompts
//        the user for the order amount and the state where the order
//        will be shipped.
//        For Wisconsin residents, prompt forthe county ofresidence.
//        • For Eau Claire county residents, add an additional 0.005
//        tax.
//        • For Dunn county residents, add an additional 0.004 tax.
//        Illinois residents must be charged 8% sales tax with no
//        additional county-level charge. All other states are not
//        charged tax. The program then displays the tax and the total
//        for Wisconsin and Illinois residents but just the total for
//        everyone else


import java.util.InputMismatchException;
import java.util.Scanner;

public class MultistateSalesTaxCalculato {

    public void calculateTax(){
        System.out.println("What is the order amount?");
        Scanner scanner = new Scanner(System.in);
        try {
            double amount = scanner.nextDouble();
            System.out.println("What state do you live in: ");
            String state = scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("Wisconsin")) {
                System.out.println("What county in Wisconsin?");
                String county = scanner.nextLine();

                if (county.equalsIgnoreCase("Eau Claire")) {
                double  tax = (amount * 0.5 / 100) + 0.005;
                    System.out.println("The tax is: $" + tax);
                    System.out.println("The total  is $" + (amount + tax) + ".");
                } else if (county.equalsIgnoreCase("Dunn")) {
                 double   tax = (amount * 0.5 / 100) + 0.004;
                    System.out.println("The tax is: $" + tax);
                    System.out.println("The total  is $" + (amount + tax) + ".");
                } else {
                  double  tax = amount * 0.5 / 100;
                    System.out.println("The tax is: $" + tax);
                    System.out.println("The total  is $" + amount  + ".");
                }

            } else if (state.equalsIgnoreCase("Illinois")) {
             double   tax = amount * 8 / 100;
                System.out.println("The tax is: $" + tax);
                System.out.println("The total  is $" + (amount + tax) + ".");
            } else {
                System.out.println("The total  is $" + amount + ".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter the corectly data");
        }
    }


    public static void main(String[] args) {
        MultistateSalesTaxCalculato multistateSalesTaxCalculato = new MultistateSalesTaxCalculato();
        multistateSalesTaxCalculato.calculateTax();

    }
}
