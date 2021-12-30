package com.FOP.FOP_Demo.Lab_7;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        try {
            // domain changed
            // should be "http://fsktm.um.edu.my"
            URL u = new URL("http://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter writeText = new PrintWriter(new FileOutputStream("index.html"));
            while (in.hasNextLine())
                writeText.write(in.nextLine() + "\n");

            writeText.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

        // read the file
        try {
            Scanner readText = new Scanner(new FileInputStream("index.html"));
            while (readText.hasNextLine())
                System.out.println(readText.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
