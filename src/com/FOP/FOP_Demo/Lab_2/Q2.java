package com.FOP.FOP_Demo.Lab_2;

public class Q2 {

    public static void main(String[] args) {
        double P = 100_000;
        double D = 10_000;
        double R = 2.5;
        int Y = 7;

        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        System.out.printf("RM %.2f", M);
    }
}
