package org.fasttrackit;
//    Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build
//    the system:


import java.util.Scanner;

public class TroubleshootingCarIssues {
    public void followingDecision() {
        System.out.println("Is the car silent when you turn the key?");
        Scanner scanner = new Scanner(System.in);
        String silent = scanner.nextLine();

        if (silent.equalsIgnoreCase("y") || silent.equalsIgnoreCase("yes")) {
            System.out.println("Are the battery terminals corroded?");
            String battery = scanner.nextLine();
            if (battery.equalsIgnoreCase("y") || battery.equalsIgnoreCase("yes")) {
                System.out.println("Clean terminals and try starting again.");
            } else if (battery.equalsIgnoreCase("n") || battery.equalsIgnoreCase("no")) {
                System.out.println("Replace cables and try again.");
            } else {
                System.out.println("Chose yes or no!");
            }

        } else if ((silent.equalsIgnoreCase("n") || silent.equalsIgnoreCase("no"))) {
            System.out.println("Does the car make a clicking noise?");
            String clicking = scanner.nextLine();
            if (clicking.equalsIgnoreCase("y") || clicking.equalsIgnoreCase("yes")) {
                System.out.println("Replace the battery.");

            } else if (clicking.equalsIgnoreCase("n") || clicking.equalsIgnoreCase("no")) {
                System.out.println("Does the car crank up but fail to start?");
                String crank = scanner.nextLine();
                if (crank.equalsIgnoreCase("y") || crank.equalsIgnoreCase("yes")) {
                    System.out.println("Check spark plug connections.");

                } else if (crank.equalsIgnoreCase("n") || crank.equalsIgnoreCase("no")) {
                    System.out.println("Does the engine start and then die?");
                    String engine = scanner.nextLine();
                    if (engine.equalsIgnoreCase("y") || engine.equalsIgnoreCase("yes")) {
                        System.out.println("Does your car have fuel injection?");
                        String injection = scanner.nextLine();

                        if (injection.equalsIgnoreCase("y") || injection.equalsIgnoreCase("yes")) {
                            System.out.println("Get it in for service.");
                        } else if (injection.equalsIgnoreCase("n") || injection.equalsIgnoreCase("no")) {
                            System.out.println("Check to ensure the choke is opening and closing.");

                        } else {
                            System.out.println("Chose yes or no!");
                        }
                    } else if (engine.equalsIgnoreCase("n") || engine.equalsIgnoreCase("no")) {
                        System.out.println("Get it in for service.");
                    } else {
                        System.out.println("Chose yes or no!");
                    }
                } else {
                    System.out.println("Chose yes or no!");
                }
            } else {
                System.out.println("Chose yes or no!");
            }
        } else {
            System.out.println("Chose yes or no!");
        }
    }

    public static void main(String[] args) {
        TroubleshootingCarIssues troubleshootingCarIssues = new TroubleshootingCarIssues();
        troubleshootingCarIssues.followingDecision();

    }
}
