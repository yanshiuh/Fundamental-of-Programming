package com.FOP.FOP_Demo.Lab_4;

import java.util.Random;

public class Q6 {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(Integer.MAX_VALUE);
        System.out.print("Random integer: " + num);

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        System.out.println("\nNumber of digits: " + count);


        /*
        String num_string = Integer.toString(num);
        System.out.println("Number of digits: " + num_string.length());
        */
    }
}
