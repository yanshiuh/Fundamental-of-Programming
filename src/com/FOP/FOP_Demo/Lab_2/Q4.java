package com.FOP.FOP_Demo.Lab_2;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int inputTime = sc.nextInt();

        int sec = inputTime % 60;
        int min = (inputTime / 60) % 60;
        int hour = inputTime / 60 / 60;

        System.out.println(hour + " hours, " + min + " minutes and " + sec + " seconds");
    }
}
