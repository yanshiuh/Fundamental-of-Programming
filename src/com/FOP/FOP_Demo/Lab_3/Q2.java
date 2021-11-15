package com.FOP.FOP_Demo.Lab_3;

import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(6);
        String numInWord = "";

        if (num == 0) numInWord = "zero";
        else if (num == 1) numInWord = "one";
        else if (num == 2) numInWord = "two";
        else if (num == 3) numInWord = "three";
        else if (num == 4) numInWord = "four";
        else numInWord = "five";

        System.out.println(num + " is " + numInWord);
    }
}

/*
        switch (num) {
                case 0:
                numInWord = "zero";
                break;
                case 1:
                numInWord = "one";
                break;
                case 2:
                numInWord = "two";
                break;
                case 3:
                numInWord = "three";
                break;
                case 4:
                numInWord = "four";
                break;
default:
        numInWord = "five";
        }*/
