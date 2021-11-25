package com.FOP.FOP_Demo.Lab_4;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();

        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        while(i < 0 || i > 100) {
            System.out.println("Interest in % couldn't bigger than 100 or smaller than 0");
            System.out.print("Enter interest in %: ");
            i = sc.nextDouble();
        }

        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();

        System.out.printf("%-10s%17s%17s%17s%20s%20s", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double M, C, L, R, totalInterest = 0;
        int n = 1;
        while (n <= N) {
            M = (P * i / (12 * 100)) / (1 - Math.pow(1 + (i / (12 * 100)), -N));
            C = M * Math.pow(1 + (i / (12 * 100)), -(1 + N - n));
            L = M - C;
            R = (L / (i / (12 * 100))) - C;
            totalInterest += L;

            System.out.println();
            System.out.printf("%-10d%17.2f%17.2f%17.2f%20.2f%20.2f", n, M, C, L, R, totalInterest);
            n++;
        }
    }
}
