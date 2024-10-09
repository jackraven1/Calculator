package se.lexicon;

import java.util.Scanner;

public class UserInput {

    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. Please select an operation!");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        return scanner.nextInt();
    }

    public int getContinueResponse() {
        Scanner scanner = new Scanner(System.in);
        int continueResponse;
        while (true) {
            System.out.println("Do you want to perform another calculation? (1 for yes, 0 for no)");
            continueResponse = scanner.nextInt();
            if (continueResponse == 1 || continueResponse == 0) {
                break;
            } else {
                System.out.println("Error, please enter 1 for yes or 0 for no.");
            }
        }
        return continueResponse;
    }
}
