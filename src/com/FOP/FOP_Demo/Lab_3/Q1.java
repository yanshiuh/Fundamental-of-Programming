package com.FOP.FOP_Demo.Lab_3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        System.out.print("Enter the operand: ");
        char ope = sc.next().charAt(0);
        double ans = 0;
        boolean valid = true;
        String equation = "";

        if (ope == '+') ans = num1 + num2;
        else if (ope == '-') ans = num1 - num2;
        else if (ope == '*') ans = num1 * num2;
        else if (ope == '/') ans = num1 / num2;
        else if (ope == '%') ans = num1 % num2;
        else valid = false;

        equation = valid ? num1 + " " + ope + " " + num2 + " = " + ans : "\n*** Invalid operation ***";
        System.out.println(equation);
    }
}



/*
        switch (ope) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
                valid = false;
                break;
        }*/
