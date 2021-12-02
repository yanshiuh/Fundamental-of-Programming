package com.FOP.FOP_Demo.Lab_5;

import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        Random r = new Random();

        int[] non_duplicate_integers = new int[10];
        for (int i = 0; i < non_duplicate_integers.length;) {
            int num = r.nextInt(21);
            boolean duplicate = false;

            // check from first number to the current exist number
            for (int j = 0; j < i+1; j++) {
                if (num == non_duplicate_integers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                non_duplicate_integers[i] = num;
                i++;   // move to next array index
            }
        }

        // Display all integers
        for (int num : non_duplicate_integers)
            System.out.print(num + " ");
    }
}


