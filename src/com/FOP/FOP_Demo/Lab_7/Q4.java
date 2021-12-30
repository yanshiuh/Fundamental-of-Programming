package com.FOP.FOP_Demo.Lab_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        try {
            Scanner readText = new Scanner(new FileInputStream("original.txt"));

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            while (readText.hasNextLine()) {
                String line = readText.nextLine();
                lineCount++;

                String[] words = line.split(" ");
                wordCount += words.length;

                for (int i = 0; i < words.length; i++)
                    charCount += words[i].length();
            }

            System.out.println("Character: " + charCount);
            System.out.println("Word: " + wordCount);
            System.out.println("Line: " + lineCount);

            readText.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}
