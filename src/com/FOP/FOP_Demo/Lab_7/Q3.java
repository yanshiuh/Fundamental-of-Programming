package com.FOP.FOP_Demo.Lab_7;

import java.io.*;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        // write text to new file (original.txt)
        try {
            PrintWriter writeText = new PrintWriter(new FileOutputStream("original.txt"));

            writeText.println("Kee Yan Shiuh");
            writeText.println("123 456 789");
            writeText.println("987 654 321");

            writeText.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        // reverse the text
        // save it to new file (reverse.txt)
        try {
            Scanner readText = new Scanner(new FileInputStream("original.txt"));
            PrintWriter writeText = new PrintWriter(new FileOutputStream("reverse.txt"));

          while (readText.hasNextLine()) {
              String sentence = readText.nextLine();

              for (int i = sentence.length() - 1; i >= 0; i--)
                  writeText.print(sentence.charAt(i));

              writeText.println(); // move to new line
          }

          readText.close();
          writeText.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }

        // print the reversed text
        try {
            Scanner readText = new Scanner(new FileInputStream("reverse.txt"));

            while (readText.hasNextLine())
                System.out.println(readText.nextLine());

            readText.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}
