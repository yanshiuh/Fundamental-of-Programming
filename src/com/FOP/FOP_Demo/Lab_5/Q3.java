package com.FOP.FOP_Demo.Lab_5;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("N employee: ");
        int N = sc.nextInt();

        for (int employee = 0; employee < N; employee++) {
            int[] employee_7days = new int[7];
            int total_hours = 0;

            for (int i = 0; i < 7; i++) {
                employee_7days[i] = r.nextInt(8) + 1; // 0-7, 1-8
                total_hours += employee_7days[i];
            }

            System.out.println("Employee " + (employee+1) + ": ");
            for (int employee_7day : employee_7days)
                System.out.print(employee_7day + " ");
            System.out.println("\nTotal work hours for employee " + (employee+1) + ": " + total_hours);
            System.out.println();
        }
    }
}
