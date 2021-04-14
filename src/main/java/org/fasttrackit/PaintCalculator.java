package org.fasttrackit;
//Sometimes you have to round up to the next number rather
//        than follow standard rounding rules.
//        Calculate gallons of paint needed to paint the ceiling of a
//        room. Prompt for the length and width, and assume one
//        gallon covers 350 square feet. Display the number of gallons
//        needed to paint the ceiling as a whole number.

import java.util.Scanner;

public class PaintCalculator {

    public void getNumberOfGallons() {
        System.out.println("For calculate the number of gallons for your room ," +
                "please give me some information.");
        System.out.println("What is length in feet of your room?");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        System.out.println("Please introduce the width in feet");
        double width = scanner.nextDouble();
        double ceiling = length * width;
        int gallon = (int) (ceiling / 350);
        System.out.println("You need " + gallon + " gallons of paint to cover " + ceiling + "  square feet.");


    }

    public static void main(String[] args) {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.getNumberOfGallons();

    }
}
