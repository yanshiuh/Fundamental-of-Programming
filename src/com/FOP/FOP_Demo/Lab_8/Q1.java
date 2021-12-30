package com.FOP.FOP_Demo.Lab_8;

import java.util.Random;

public class Q1 {

    public static void main(String[] args) {
        Number a = new Number();
        a.displayAll();
        a.displayEven();
        a.displayPrime();
        a.displayMax();
        a.displayMin();
        a.displayAverage();
        a.displaySquare();

        System.out.println("\n");

        Number b = new Number(5);
        b.displayAll();

        System.out.println("\n");

        Number c = new Number(4, 50);
        c.displayAll();
    }
}

class Number {
    private int occ = 10;
    private int max = 100;
    private int[] numbers;

    public Number() {
        numbers = new int[occ];
        generateNumber();
    }

    public Number(int occ) {
        this.occ = occ;
        numbers = new int[this.occ];
        generateNumber();
    }

    public Number(int occ, int max) {
        this.occ = occ;
        this.max = max;
        numbers = new int[this.occ];
        generateNumber();
    }

    private void generateNumber() {
        Random r = new Random();
        for (int i = 0; i < occ; i++)
            numbers[i] = r.nextInt(max + 1);
    }

    public void displayAll() {
        System.out.print("All numbers: ");
        for (int number : numbers)
            System.out.print(number + " ");
    }

    public void displayEven() {
        System.out.print("\nEven numbers: ");
        for (int number: numbers)
            if (number % 2 == 0)
                System.out.print(number + " ");
    }

    public void displayPrime() {
        System.out.print("\nPrime numbers: ");
        for (int number: numbers) {
            boolean isPrime = true;
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(number + " ");
        }
    }

    public void displayMax() {
        int max = numbers[0];
        for (int number: numbers)
            if (number > max) max = number;

        System.out.println("\nMaximum number: " + max);
    }

    public void displayMin() {
        int min = numbers[0];
        for (int number: numbers)
            if (number < min) min = number;

        System.out.println("Minimum number: " + min);
    }

    public void displayAverage() {
        int sum = 0;
        for (int number: numbers) sum += number;

        System.out.printf("Average : %.2f", sum / (double)occ);
    }

    public void displaySquare() {
        System.out.print("\nSquare number: ");
        for (int number: numbers) {
            for (int i = 1; i < number; i++) {
                if (Math.sqrt(number) == i) System.out.print(number + " ");
            }
        }
    }
}
