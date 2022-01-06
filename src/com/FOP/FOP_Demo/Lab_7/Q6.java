package com.FOP.FOP_Demo.Lab_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        try {
            // count number of product to create dimensional array product
            Scanner countProduct = new Scanner(new FileInputStream("product.txt"));
            int numProduct = 0;
            while (countProduct.hasNextLine()) {
               countProduct.nextLine();
                numProduct++;
            }
            countProduct.close();

            Scanner readOrder = new Scanner(new FileInputStream("order.txt"));
            Scanner readProduct = new Scanner(new FileInputStream("product.txt"));

            String[][] product = new String[numProduct][];
            for (int i = 0; i < numProduct; i++) {
                // SK020
                // Enfagrow A+
                // 36.79
                product[i] = readProduct.nextLine().split(",");
            }

            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");

            while (readOrder.hasNextLine()) {
                String[] order = readOrder.nextLine().split(","); // make every order become an array
                // order = {ORD001, SK079, 20}

                for (int i = 0; i < product.length; i++) {
                    // if both productID are same = matched
                    if (order[1].equalsIgnoreCase(product[i][0])) {
                        double totalPrice = Integer.parseInt(order[2]) * Double.parseDouble(product[i][2]);

                        System.out.printf("%-20s%-20s%-20s%-20s%-20.2f\n", product[i][0], product[i][1], order[2], product[i][2], totalPrice);
                    }
                }
            }
            
            readProduct.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}
/*
        SK020,Enfagrow A+,36.79
        SK042,Ayamas Nuget Crispy,9.99
        SK013,100 Plus,6.49
        SK066,Ali Cafe,8.99
        SK079,Dettol Natural,4.99
        SK088,Jasmine Pearl,37.99
        SK023,Johnson PH 5.5,5.99

        ORD001,SK079,20
        ORD002,SK013,74
        ORD003,SK088,27
        ORD004,SK042,60
        ORD005,SK066,79
*/
