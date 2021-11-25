package com.FOP.FOP_Demo.Lab_3;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        Random r = new Random();

        int scoreP1 = 0;
        int scoreP2 = 0;
        int dice;

        for (int i = 0; i < 2; i++) {
            System.out.println("Round " + (i+1));

            dice = r.nextInt(6) + 1;
            System.out.println("Player 1's dice: " + dice);
            scoreP1 += dice;

            dice = r.nextInt(6) + 1;
            System.out.println("Player 2's dice: " + dice);
            scoreP2 += dice;
            System.out.println();
        }

        System.out.println("Player 1's score: " + scoreP1);
        System.out.println("Player 2's score: " + scoreP2);
        System.out.println();

        if (scoreP1 > scoreP2)
            System.out.println("Player 1 win!");
        else if (scoreP2 > scoreP1)
            System.out.println("Player 2 win!");
        else
            System.out.println("The game is draw");
    }
}
