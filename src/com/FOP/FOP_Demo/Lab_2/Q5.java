package com.FOP.FOP_Demo.Lab_2;

import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(10000);
        System.out.println("The random number is " + num);

        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }

        System.out.println("Sum of all digits in number: " + sum);
    }
}
