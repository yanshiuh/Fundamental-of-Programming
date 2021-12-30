package com.FOP.FOP_Demo.Lab_7;

import java.io.*;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // create a binary file
        try {
            ObjectOutputStream writeBinary = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            writeBinary.writeUTF("WXES1116");
            writeBinary.writeUTF("Programming I");

            writeBinary.writeUTF("WXES1115");
            writeBinary.writeUTF("Data Structure");

            writeBinary.writeUTF("WXES1110");
            writeBinary.writeUTF("Operating System");

            writeBinary.writeUTF("WXES1112");
            writeBinary.writeUTF("Computing Mathemathcs I");

            // Another way
            /*String[][] array = {
                    {"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}
            };

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    writeBinary.writeUTF(array[i][j]);
                }
            }*/

            writeBinary.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        // searching course in the binary file
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Course code: ");
            String courseCode = sc.nextLine();
            boolean found = false;

            ObjectInputStream readBinary = new ObjectInputStream(new FileInputStream("coursename.dat"));

            try {
                while (true) {
                    String code = readBinary.readUTF();
                    String name = readBinary.readUTF();
                    if (courseCode.equals(code)) {
                        found = true;
                        System.out.println("Course name: " + name);
                        break;
                    }
                }
            } catch (EOFException e) {
                if (found == false)
                    System.out.println("Couldn't find the course code");
            }
            readBinary.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }
}
