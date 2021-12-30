package com.FOP.FOP_Demo.Lab_7;

import java.io.*;

public class Q5 {

    public static void main(String[] args) {
        /*
        5
        Mohamad Ali 24 M
        Siti Nuraini 27 F
        Tan Mei Kuan 19 F
        Mutu Samy 29 M
        Alvin Tan 26 M
        */
        try {
            ObjectInputStream readBinary = new ObjectInputStream(new FileInputStream("person.dat"));

            int totalNumberOfRecord = readBinary.readInt();
            System.out.println("Number of records: " + totalNumberOfRecord + "\n");
            String[][] person = new String[totalNumberOfRecord][3];

            try {
                int row = 0;
                while (true) {
                    String name = readBinary.readUTF();
                    int age = readBinary.readInt();
                    char gender = readBinary.readChar();

                    person[row][0] = name;
                    person[row][1] = Integer.toString(age);
                    person[row][2] = gender + " ";
                    row++;
                }

            } catch (EOFException e) {}

            // sort using bubble sort
            for (int i = 0; i < person.length; i++) {
                for (int j = 0; j < person.length - 1; j++) {
                    if (person[j][0].compareToIgnoreCase(person[j + 1][0]) > 0) {
                        String[] temp = person[j];
                        person[j] = person[j + 1];
                        person[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < person.length; i++) {
                System.out.println("Names: " + person[i][0]);
                System.out.println("Age: " + person[i][1]);
                System.out.println("Gender: " + person[i][2]);
                System.out.println();
            }

            readBinary.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }
}
