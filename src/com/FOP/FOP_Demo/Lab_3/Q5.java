package com.FOP.FOP_Demo.Lab_3;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b and e for equation 1 (ax + by = e): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int e = sc.nextInt();

        System.out.print("Enter c, d and f for equation 2 (cx + dy = f): ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();

        int x, y;
        if (((a*d) - (b*c)) == 0) {
            System.out.println("The equation has no solution");
        } else {
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
