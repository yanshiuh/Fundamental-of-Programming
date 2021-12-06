package com.FOP.FOP_Demo.Lab_5;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        Random r = new Random();

        // Generate the matrix
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {         // row
            for (int j = 0; j < matrix[i].length; j++) {  // column
                matrix[i][j] = r.nextInt(10);
            }
        }

        // Print the matrix
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "  ");

            System.out.println();
        }

        // Rotate the matrix 90 degrees
        int[][] new_matrix = new int[matrix.length][matrix[0].length];
        int new_row = 0;
        int new_column = 0;
        for (int column = 0; column < matrix.length; column++) { // from first column
           for (int row = matrix.length - 1; row >= 0; row--) {  // from last element in the column
                new_matrix[new_row][new_column] = matrix[row][column];
                new_column++;
            }
            new_row++;
            new_column = 0;
        }

        // new matrix: 0,0 -> 0,1 -> 0,2
        // 0ld matrix: 2,0 -> 1,0 -> 0,0

        System.out.println("After rotates 90 degree clockwise");
        for (int i = 0; i < new_matrix.length; i++) {
            for (int j = 0; j < new_matrix[i].length; j++)
                System.out.print(new_matrix[i][j] + "  ");

            System.out.println();
        }
    }
}

// example
//      old matrix                             new matrix
//first column first row (0,0)  >>       third column first row (0,2)
//first column second row(1,0)  >>       second column first row(0,1)
//first column third row (2,0)  >>       first column first row (0,0)
//conclusion : column of old matrix become row of new matrix

//iterating through the old matrix from last row of the column
            /*
            1 5 7    5 3 1
            3 6 9    0 0 0
            5 3 8    0 0 0
             */
// 2 main concepts:
// - column of old matrix becomes row of new matrix
// - start from last element of the column of the old matrix
//   and assign it become the first element of the row of the new matrix
            
