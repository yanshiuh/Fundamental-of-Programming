package com.FOP.FOP_Demo.Lab_6;

public class Q1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " --> " + triangleNumbers(i));
        }
    }

    public static int triangleNumbers(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++)
            num += i;

        return num;
    }
}
