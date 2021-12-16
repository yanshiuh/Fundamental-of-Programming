package com.FOP.FOP_Demo.Lab_5;

import java.util.Random;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = sc.nextInt();
        int[][] matrix = new int[row][row];

        // iterate first column and make it the value as 1
        for (int i = 0; i < matrix.length; i++)
            matrix[i][0] = 1;

        // iterate each row starting from row 2 because we have to compare it with previous row
        for (int i = 1; i < matrix.length; i++) {
            // iterate each column starting from column 2 because have to compare with previous column
            for (int j = 1; j < matrix[i].length; j++)
                // sum of the upper and upper left
                matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][j - 1];
        }

        System.out.println("The Pascal Triangle with " + row + " row(s)");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
