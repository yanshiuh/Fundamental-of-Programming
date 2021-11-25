package com.FOP.FOP_Demo.Lab_4;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        //1. find the total days before the specific month = 120
        //2. add the total days with the first day of the year = 125
        //3. modulus it with 7, remainder = the first day of the month = 6
        //4. display output

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the first day of the year: ");
        int first_day = sc.nextInt();

        // count the total days of the first 4 months
        int days = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // leap year
            days = 31 + 29 + 31 + 30;
        else
            days = 31 + 28 + 31 + 30;

        // indicate first day of the May
        first_day += days;  // first_day = first_day + days
        first_day %= 7;     // first_day = first_day % 7;  // to find the first day of May

        // May
        System.out.println(".".repeat(40) + "  May  " + ".".repeat(40));
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");

        // get the location of the first day of the month
        for (int i = 1; i <= first_day; i++)
            System.out.printf("%13s", " ");

        // display all days
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%13d", i);
            first_day++; //
            if (first_day % 7 == 0)
                System.out.println();  // enter the next week(line)
        }

        System.out.println("\n\n");

        // August
        first_day += 30 + 31;
        first_day %= 7;

        System.out.println(".".repeat(40) + "  August  " + ".".repeat(40));
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");

        for (int i = 1; i <= first_day; i++)
            System.out.printf("%13s", " ");

        for (int i = 1; i <= 31; i++) {
            System.out.printf("%13d", i);
            first_day++;
            if (first_day % 7 == 0)
                System.out.println();
        }

        System.out.println();

    }
}
