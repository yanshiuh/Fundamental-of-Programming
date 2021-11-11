package com.FOP.FOP_Demo.Lab_2;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double M = sc.nextInt() / 1000.0;

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initTemp = (sc.nextDouble() - 32) / 1.8;

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = (sc.nextDouble() - 32) / 1.8;

        double energy = M * (finalTemp - initTemp) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
