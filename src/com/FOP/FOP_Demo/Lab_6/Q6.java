package com.FOP.FOP_Demo.Lab_6;

public class Q6 {

    public static void main(String[] args) {
        int current_number = 2;

        System.out.println("First 20 palindromic prime: ");
        for (int i = 0; i < 20;) {
            if (palindromicPrime(current_number)) {
                System.out.print(current_number + " ");
                i++;
            }
            current_number++;
        }
        System.out.println();

        current_number = 2;
        System.out.println("\nFirst 20 emirp: ");
        for (int i = 0; i < 20;) {
            if (isEmirp(current_number)) {
                System.out.print(current_number + " ");
                i++;
            }
            current_number++;
        }
    }

    public static boolean palindromicPrime(int num) {
        return isPalindrome(num) && isPrime(num);
    }

    public static boolean isEmirp(int num) {
        int number = num;
        int reverse = 0;
        while (num > 0) {
            reverse *= 10;
            reverse += num % 10;
            num /= 10;
        }

        return isPrime(number) && isPrime(reverse) && !palindromicPrime(number);
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int j = 2; j <= num/2; j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPalindrome(int num) {
        int number = num;
        int palindrome = 0;
        while (num > 0) {
            palindrome *= 10;
            palindrome += num % 10;
            num /= 10;
        }

        return palindrome == number;
    }
}
