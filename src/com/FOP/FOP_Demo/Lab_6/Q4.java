package com.FOP.FOP_Demo.Lab_6;

public class Q4 {

    public static void main(String[] args) {
        System.out.println("GCD for (25,8): " + gcd(25, 8));
//        System.out.println("GCD for (200,625): " + gcd(200, 625));
    }

    public static int gcd(int dividend, int divisor) {
         /*
        1st round:
           25    /    8    =  3 r 1
           ^          ^           ^
        dividend    divisor   remainder

        next_dividend = current_divisor
        next_divisor = current_remainder

        2nd round:
           8     /    1     =  8 r 0
           ^          ^            ^
        dividend    divisor   remainder

        remainder == 0, break the process
        Greatest common divisor(GCD) = the divisor
        GCD = 1
         */
        int remainder;
        while (true) {
            remainder = dividend % divisor;

            System.out.println("Dividend = "+ dividend);
            System.out.println("Divisor = " + divisor);
            System.out.println("Remainder = " + remainder);
            System.out.println();

            if (remainder == 0) break;

            dividend = divisor;
            divisor = remainder;

        }

        return divisor;
    }
}
