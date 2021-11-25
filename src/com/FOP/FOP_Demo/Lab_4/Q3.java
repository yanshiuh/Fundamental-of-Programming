package com.FOP.FOP_Demo.Lab_4;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        int sum = 0;
        int sum_square = 0;
        int n = 0;
        int min = 100; // Integer.MAX_VALUE
        int max = 0; // Integer.MIN_VALUE

        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            score = sc.nextInt();

            // exit the while loop when score is neg
            if (score < 0) break;

            sum += score;
            sum_square += Math.pow(score, 2);

            if (score < min) min = score;
            if (score > max) max = score;

            n++; // to count total number of score;
        }

        double average = (double) sum / n;
        double std = Math.sqrt((sum_square - (Math.pow(sum, 2) / n)) / (n-1));

        System.out.println("Minimum Score: " +  min);
        System.out.println("Maximum Score: " +  max);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.printf("Standard Deviation: %.2f", std);
    }
}
