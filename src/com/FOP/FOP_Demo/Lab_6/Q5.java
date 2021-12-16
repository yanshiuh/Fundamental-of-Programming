package com.FOP.FOP_Demo.Lab_6;

import java.util.Random;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int score = 0;
        while (true) {
            int num1 = r.nextInt(13);
            int num2 = r.nextInt(13);

            System.out.print("Enter negative number to quit. ");
            int ans = sc.nextInt();
            System.out.println(num1 + " x " + num2 + " = " + ans);

            if (ans < 0) break;
            if (multiplicationCorrect(num1,num2,ans)) score++;
        }
        System.out.println("Your score is " + score);
    }

    public static boolean multiplicationCorrect(int num1, int num2, int ans) {
        return num1 * num2 == ans;
    }

}
