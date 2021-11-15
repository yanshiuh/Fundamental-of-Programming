package com.FOP.FOP_Demo.Lab_2;

import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        Random r = new Random();

        int num1 = r.nextInt(41) + 10;
        int num2 = r.nextInt(41) + 10;
        int num3 = r.nextInt(41) + 10;

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        
        System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f", average);
    }
}
