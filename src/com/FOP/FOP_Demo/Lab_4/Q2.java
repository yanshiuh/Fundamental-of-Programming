package com.FOP.FOP_Demo.Lab_4;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {    // run the addition N(num) round
            for (int j = 1; j <= i; j++) {  // add the number from 1 to i
                sum += j;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
