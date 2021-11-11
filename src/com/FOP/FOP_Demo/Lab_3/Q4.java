package com.FOP.FOP_Demo.Lab_3;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        Random r = new Random();

        int scoreP1 = 0;
        int scoreP2 = 0;
        int dice1;
        int dice2;

        for (int i = 0; i < 2; i++) {
            dice1 = r.nextInt(6) + 1;
            System.out.println("Player 1's dice in round " + (i+1) + ": " + dice1);
            scoreP1 += dice1;
        }
        System.out.println("Player 1's total score: " + scoreP1 + "\n");

        for (int i = 0; i < 2; i++) {
            dice2 = r.nextInt(6) + 1;
            System.out.println("Player 2's dice in round " + (i+1) + ": " + dice2);
            scoreP2 += dice2;
        }
        System.out.println("Player 2's total score: " + scoreP2 + "\n");

        if (scoreP1 > scoreP2) System.out.println("Player 1 wins the game");
        else if (scoreP2 > scoreP1) System.out.println("Player 2 wins the game");
        else System.out.println("The game is draw");
    }
}
