package com.FOP.FOP_Demo.Lab_5;

import java.util.Random;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[20];
        for (int i = 0 ; i < numbers.length; i++)
            numbers[i] = r.nextInt(101);

        System.out.println("A list of random integer within 0 to 100");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) System.out.print(numbers[i]);
            else System.out.print(numbers[i] + ", ");
        }

        // Sort in descending order using Bubble Sort
        for (int pass = 0; pass < numbers.length; pass++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                // if current number smaller than the next number, then swap
                if (numbers[i] < numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nArray in descending order");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) System.out.print(numbers[i]);
            else System.out.print(numbers[i] + ", ");
        }

        System.out.print("\nEnter a number to search: ");
        int num = sc.nextInt();

        // Linear Search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                System.out.println(num + " found");
                System.out.println("Linear search - " + i + " loops");
                break;
            } else if (i == numbers.length - 1 && num != numbers[i])
                System.out.println("Linear search: The number is not found");
        }

        // Binary Search
        int low = 0, middle, high = numbers.length - 1;
        int count = 0;
        while (low <= high) {
            count++;

            middle = (low + high) / 2;
            if (num == numbers[middle]) {
                System.out.println(num + " found");
                System.out.println("Binary Search - " + count + " loops");
                break;
            } else if (num > numbers[middle])
                high = middle - 1;
            else
                low = middle + 1;
        }

        if (low > high)
            System.out.println("Binary Search: The number is not found");
    }
}
