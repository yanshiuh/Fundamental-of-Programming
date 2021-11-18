package com.FOP.FOP_Demo.Lab_3;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter (x,y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2)); // Pythagorean theorem
        System.out.printf("Distance: %.2f\n", distance);

        if (distance > radius)
            System.out.println("The point is outside the circle");
        else
            System.out.println("The point is inside the circle");
    }
}
