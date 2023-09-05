package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("What is you're name? ");
        String name = scanner.nextLine();

        System.out.println("Hello there " + name + ", how many dices do you want to throw?");

        throwDice();


    }

    public static void throwDice() {
        int diceNumber = scanner.nextInt();
        if (diceNumber > 6) {
            System.out.println("The number of dice is too big!");
        } else if (diceNumber == 0) {
            System.out.println("You need to throw at least one dice! ");
        } else if (diceNumber < 0) {
            System.out.println("You can't use negative numbers!");
        }

        //importing the Random class
        Random dice = new Random();
        String name = scanner.nextLine();

        System.out.println("Hey " + name + ", you've rolled: " + diceNumber);
        int total = 0;
        int randomNumber;

        System.out.println("You're points are now: \n");

        for (int i = 0; i < diceNumber; i++) {
            randomNumber = dice.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.println(randomNumber);
        }

        System.out.println("\nTotal: " + total);
        scanner.close();

    }
}
