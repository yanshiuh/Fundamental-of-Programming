package com.FOP.FOP_Demo.Lab_5;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("N student(s): ");
        int N = sc.nextInt();

        int[] scores = new int[N];
        double sum = 0;
        System.out.print("List of score: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = r.nextInt(101);
            sum += scores[i];
            System.out.print(scores[i] + " ");
        }

        // Find the highest score
        int highest = scores[0];  // 0
        for (int score : scores)
            if (score > highest) highest = score;
        System.out.println("\nThe highest score: " + highest);

        // Find the lowest score
        int lowest = scores[0];   // 100
        for (int score : scores)
            if (score < lowest) lowest = score;
        System.out.println("The lowest score: " + lowest);

        // Find the average score
        double average = sum / scores.length;
        System.out.printf("The average score: %.2f", average);
    }
}

/*
Arrays.sort(score);
System.out.println("The lowest score is " + score[0]);
System.out.println("The highest score is " + score [N-1]);
*/
