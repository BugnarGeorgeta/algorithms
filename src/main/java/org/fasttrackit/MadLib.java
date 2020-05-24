package org.fasttrackit;

import java.util.Scanner;

//Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then
//        construct a list of words and place them into the story, creating an often silly or funny story as a result.
//        Create a simple mad-lib program that prompts for a noun,
//        a verb, an adverb, and an adjective and injects those into a
//        story that you create.
public class MadLib {

    public void createMad() {
        System.out.println("Hello you start a new fun game!");
        System.out.println("Enter a noun:");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        System.out.println("Enter a verb:");
        String verb = scanner.nextLine();
        System.out.println("Enter an adjective:");
        String adjective = scanner.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = scanner.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + " ?" + "That's fun:)");
    }

    public static void main(String[] args) {
        MadLib madLib = new MadLib();
        madLib.createMad();
    }

}
