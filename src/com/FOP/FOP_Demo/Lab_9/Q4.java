package com.FOP.FOP_Demo.Lab_9;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        Player p1 = new Player("Kee");
        Player p2 = new Player("Ronny");
        DiceGame a = new DiceGame(p1, p2, 2);
        a.start();
    }
}

class DiceGame {
    Player p1, p2;
    int typeOfGame;

    public DiceGame() {
    }

    public DiceGame(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public DiceGame(Player p1, Player p2, int game) {
        this.p1 = p1;
        this.p2 = p2;
        this.typeOfGame = game;
    }

    public void start() {
        if (typeOfGame == 1) {
            Game1 a = new Game1(p1, p2);
            a.play();
        } else {
            Game2 b = new Game2(p1, p2);
            b.play();
        }
    }
}

class Player {
    String name;
    int score;
    Random r = new Random();

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public int roll() {
        int dice = r.nextInt(6) + 1;
        System.out.println(this.getName() + " rolls " + dice);
        return dice;
    }

    public void display() {
        System.out.println("Player " + name + "'s score: " + score);
    }
}

class Game1 extends DiceGame {
    int round;

    public Game1(Player p1, Player p2) {
        super(p1, p2);
        round = 0;
    }

    public void play() {
        while (p1.getScore() < 100 && p2.getScore() < 100) {
            System.out.println("--- Round " + round + " ---");
            int p1d1 = p1.roll();
            int p1d2 = p1.roll();
            if (p1d1 == p1d2) p1.setScore(p1d1 + p1d2 + p1.roll());
            else p1.setScore(p1d1 + p1d2);
            p1.display();

            int p2d1 = p2.roll();
            int p2d2 = p2.roll();
            if (p2d1 == p2d2) p2.setScore(p2d1 + p2d2 + p2.roll());
            else p2.setScore(p2d1 + p2d2);
            p2.display();

            if (p1.getScore() > 100) {
                System.out.println("*** " + p1.getName() + " wins the game ***");
                break;
            } else if (p2.getScore() > 100) {
                System.out.println("*** " + p2.getName() + " wins the game ***");
                break;
            }
            round++;
            System.out.println();
        }
    }
}

class Game2 extends DiceGame {
    int round;

    public Game2(Player p1, Player p2) {
        super(p1, p2);
        round = 0;
    }

    public void play() {
        int dice1, dice2;
        while (p1.getScore() < 100 && p2.getScore() < 100) {
            System.out.println("--- Round " + round + " ---");
            // Player 1 rolls
            dice1 = p1.roll();
            if (dice1 == 6) {
                dice1 = dice1 + p1.roll();
            }
            p1.setScore(dice1);
            if (p1.getScore() > 100) {
                p1.score -= dice1;
            }
            p1.display();

            // Player 2 rolls
            dice2 = p2.roll();
            if (dice2 == 6) {
                dice2 = dice2 + p2.roll();
            }
            p2.setScore(dice2);
            if (p2.getScore() > 100) {
                p2.score -= dice2;
            }
            p2.display();

            // check whether equals to 100
            if (p1.getScore() == 100) {
                System.out.println("*** " + p1.getName() + " wins the game ***");
                break;
            } else if (p2.getScore() == 100) {
                System.out.println("*** " + p2.getName() + " wins the game ***");
                break;
            }

            round++;
            System.out.println();

        }
    }
}
