package org.fasttrackit;
//Division isn’t always exact, and sometimes you’ll write
//        programs that will need to deal with the leftovers as a whole
//        number instead of a decimal.
//        Write a program to evenly divide pizzas. Prompt for the
//        number of people, the number of pizzas, and the number of
//        slices per pizza. Ensure that the number of pieces comes out
//        even. Display the number of pieces of pizza each person
//        should get. If there are leftovers, show the number of leftover
//        pieces.

import java.util.Scanner;

public class PizzaParty {

    public void getPiecesOfPizza() {
        System.out.println("How many people?");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizza = scanner.nextInt();
        System.out.println(people + " people with " + pizza + " pizzas.");
        int piecesEveryPizza = 8;
        int piecePizza = (pizza * piecesEveryPizza) / people;
        int dif = (pizza * piecesEveryPizza) - (people * piecePizza);
        System.out.println("Each person gets " + piecePizza + " pieces of pizza.");
        System.out.println("There are " + dif + " leftover pieces.");

    }

    public static void main(String[] args) {
        PizzaParty pizzaParty = new PizzaParty();
        pizzaParty.getPiecesOfPizza();

    }
}
