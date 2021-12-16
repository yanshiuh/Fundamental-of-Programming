package com.FOP.FOP_Demo.Lab_6;

import java.util.Arrays;
import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        Random r = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = r.nextInt(10000);
        System.out.println(Arrays.toString(numbers));

        reverse_numbers(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] reverse_numbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            // reverse number
            int reverseNum = 0;
            while (num > 0) {
                reverseNum *= 10;       // 0, 40, 480, 4820
                reverseNum += num % 10; // 4, 48, 482, 4822
                num /= 10;              // 228, 22, 2, 0
            }

            numbers[i] = reverseNum;
        }
        return numbers;
    }
}

