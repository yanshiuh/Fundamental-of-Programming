package com.FOP.FOP_Demo.Lab_8;

public class Q4 {

    public static void main(String[] args) {
        Fraction a= new Fraction();
        a.setNumerator(6);
        a.setDenominator(24);
        System.out.println("The fraction: "+ a.getNumerator() + " / " + a.getDenominator());
        a.displayFraction();
    }
}

class Fraction {
    private int numerator, denominator;

    public Fraction() {
        numerator = 0;
        denominator = 0;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void displayFraction() {
        int gcd = 1;
        int max;

        max = Math.max(denominator, numerator);

        for (int i = max ; i >= 1; i--) {
            // max = 24, another = 6
            if (denominator % i == 0 && numerator % i == 0) {
                gcd = i;
                break;
            }
        }

        denominator /= gcd;
        numerator /= gcd;

        System.out.print("The simplest fraction: ");
        if (denominator == 1)
            System.out.println(numerator);
        else
            System.out.println(numerator + " / " + denominator);
    }
}