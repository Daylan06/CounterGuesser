package com.company;

import java.util.Scanner;

import java.util.Random;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        int Score = 0;
        int Place = 1;

        String[] Colour = {"red", "blue", "yellow", "green"};
        Random random = new Random();
        int index = random.nextInt(Colour.length);

        System.out.println("Welcome to the colour guessing game!");
        System.out.println("");
        System.out.println("I have 10 places within a list, each place filled with a colour");
        System.out.println("Guess each colour in their order to win a point");
        System.out.println("If you guess incorrectly you will loose a point");
        System.out.println("Your Score will be displayed after every turn");
        System.out.println("");
        System.out.println("The colours you can pick from are");
        System.out.println("red, blue, yellow, or green");

        ArrayList<String> CounterColour = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            CounterColour.add(Colour[random.nextInt(3)]);
            System.out.println("Guess the next colour in place " + Place + " of the list:");

            String RandomColour = input.next();
            if (RandomColour.equalsIgnoreCase(CounterColour.get(i))) {
                System.out.println("You guessed the colour correctly " + " You got 1 point!");
                count++;
                Place++;
            } else {
                System.out.println("You guessed the colour incorrectly " + " You lost 1 point");
                count = (count - 1);
                Place++;
            }

            Score = count;
            System.out.println("Your Score is " + Score);
            System.out.println("");

        }

    }
}