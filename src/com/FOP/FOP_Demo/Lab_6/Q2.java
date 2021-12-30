package com.FOP.FOP_Demo.Lab_6;

public class Q2 {

    public static void main(String[] args) {
        int triangle_height = 3;
        for (int i = 0; i < triangle_height; i++) {
            multiPrint(triangle_height - i, ' ');
            multiPrint(i+1+i, '*');     // i+1+i, 1 = as a mirror/middle, both side have to print same number of *
            System.out.println();
        }

        System.out.println();

        // if height = even number, print 2 parts (2 triangle)
        // if height = odd number, print 3 parts (1 triangle, middle part, 1 triangle)
        int diamond_height = 7;
        int half_diamond = diamond_height / 2;
        for (int i = 0; i < half_diamond; i++) {    // upper part
            multiPrint(half_diamond - i, ' ');
            multiPrint(i+1+i, '*');
            System.out.println();
        }

        if (diamond_height % 2 != 0) { // if diamond_height is not even
            multiPrint(half_diamond + 1 + half_diamond, '*'); // middle part
            System.out.println();
        }

        for (int i = half_diamond - 1; i >= 0; i--) { // lower part
            multiPrint(half_diamond - i, ' ');
            multiPrint(i+1+i, '*');
            System.out.println();
        }


    }

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++)
            System.out.print(c + " ");
    }
}
