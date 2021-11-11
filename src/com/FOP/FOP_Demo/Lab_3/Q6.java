package com.FOP.FOP_Demo.Lab_3;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        System.out.print("Enter (x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            if (x > radius || y > radius) System.out.println("The point is outside the circle");
            else System.out.println("The point is inside the circle");
        } else // gt negative coordinate
            {
            radius = -radius;
            if (x < radius || y < radius) System.out.println("The point is outside the circle");
            else System.out.println("The point is inside the circle");
        }
    }
}
