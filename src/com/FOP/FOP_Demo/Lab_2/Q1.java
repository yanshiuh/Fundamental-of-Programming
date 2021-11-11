package com.FOP.FOP_Demo.Lab_2;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        int tempInFahrenheit = 100;
        double tempInCelsius = (tempInFahrenheit - 32) / 1.8;

        System.out.printf("Temperature in degree Celsius = %.2f",tempInCelsius);
    }
}

// Some methods to display number in 2 decimal places
// - Using String’s format() method
//   - String.format(%.2f, d)

// - Using Formatter
//   - Formatter formatter = new Formatter();
//     formatter.format("%.2f", d);
//     System.out.println("Double upto 2 decimal places: " + formatter.toString());

