package org.fasttrackit;
//When working in a global environment, you’ll have to
//        present information in both metric and Imperial units. And
//        you’ll need to know when to do the conversion to ensure
//        the most accurate results.
//        Create a program that calculates the area of a room. Prompt
//        the user for the length and width of the room in feet. Then
//        display the area in both square feet and square meters

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaRectagularRoom {

    public void calculateArea() {
        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double width = scanner.nextDouble();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feed.");
        double feet = length * width;
        double square = feet * 0.09290304;
        DecimalFormat df = new DecimalFormat("#.###");
        double value = Double.parseDouble(df.format(square));

        System.out.println("The area is " + feet + "  square feet " + value + " square meters");
    }

    public static void main(String[] args) {
        AreaRectagularRoom room = new AreaRectagularRoom();
        room.calculateArea();

    }
}
