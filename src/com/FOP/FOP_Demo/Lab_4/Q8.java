package com.FOP.FOP_Demo.Lab_4;

import java.util.Random;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Random r = new Random();
        int total_prime_number = r.nextInt(101);
        System.out.println("First " + total_prime_number + " prime numbers");

        int num_printed_prime_number = 0;
        int num = 2;  // 1st prime number is 2

        while (num_printed_prime_number < total_prime_number) {
            boolean isPrime = true;
            for (int i = 2; i <= num/2; i++) { // i <= num-1, i <= Math.sqrt(num)
                if (num % i == 0) {   // to identify whether got other factors
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                num_printed_prime_number++;
            }
            num++;  // check for the next number
        }
    }
}
