package com.FOP.FOP_Demo.Lab_8;

import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        Game g1 = new Game("Durant");
        Game g2 = new Game("Harden");

        while (!g1.isWin() && !g2.isWin()) {
            g1.move();
            g2.move();
            System.out.println(g1.getPlayer_name() + "'s score: " + g1.getScore());
            System.out.println(g2.getPlayer_name() + "'s score: " + g2.getScore());

            System.out.println();
        }

        if (g1.isWin())
            System.out.println(g1.getPlayer_name() + " win");
        else
            System.out.println(g2.getPlayer_name() + " win");
    }
}

class Game {
    private Random r = new Random();
    private String player_name;
    private int score = 0;

    public Game(String player_name) {
        this.player_name = player_name;
    }

    public void move() {
        int dice = r.nextInt(6) + 1;
        System.out.println(this.player_name + " rolls " + dice);
        score += dice;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public int getScore() {
        return score;
    }

    public boolean isWin() {
        return score >= 100;
    }
}
