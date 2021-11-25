package com.FOP.FOP_Demo.Lab_4;

import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        Random r = new Random();

        int scoreP1 = 0, scoreP2 = 0;
        int dice;

        while (scoreP1 <= 100 && scoreP2 <= 100) {
            do {
                System.out.print("Player 1's turn: ");
                dice = r.nextInt(6) + 1;
                scoreP1 += dice;
                System.out.println(scoreP1);
            } while (dice == 6);

            do {
                System.out.print("Player 2's turn: ");
                dice = r.nextInt(6) + 1;
                scoreP2 += dice;
                System.out.println(scoreP2);
            } while (dice == 6);

            System.out.println();
        }

        if (scoreP1 < 100) System.out.println("Player 2 win!");
        else System.out.println("Player 1 win!");
    }
}
