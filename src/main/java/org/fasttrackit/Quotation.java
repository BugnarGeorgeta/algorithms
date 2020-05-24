package org.fasttrackit;
//Quotation marks are often used to denote the start and end
//        of a string. But sometimes we need to print out the quotation
//        marks themselves by using escape characters.
//        Create a program that prompts for a quote and an author.
//        Display the quotation and author as shown in the example
//        output.

import java.util.Scanner;

public class Quotation {

    public void markQuotation() {
        System.out.println("What is the quote?:");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        System.out.println("Who said it?");
        String author = scanner.nextLine();
        System.out.println(author + " says " + "," + " ' " + quote + " ' ");
    }

    public static void main(String[] args) {
        Quotation quotation = new Quotation();
        quotation.markQuotation();
    }
}
