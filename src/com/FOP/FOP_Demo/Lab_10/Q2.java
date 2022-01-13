package com.FOP.FOP_Demo.Lab_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // product.txt -> SubstitutionEncrypt.txt -> SubstitutionDecrypt

        //the program will have exception if product.txt does not exist in the project
        //in this case , the input file is product.txt while the output file is cipherText.txt
        //the shift value is 15
        SubstitutionCipher encode = new SubstitutionCipher("product.txt", "SubstitutionEncrypt.txt", 3);

        //in this case , the input file is cipherText.txt while the plainText.txt is the output file
        //the shift value is 15
        SubstitutionCipher decode = new SubstitutionCipher("SubstitutionEncrypt.txt", "SubstitutionDecrypt.txt", 3);

        //then encode and decode
        //the product.txt and SubstitutionDecrypt.txt should have the same contents in this case
        encode.readPlainFile();
        decode.readEncryptFile();
    }
}

class SubstitutionCipher implements MessageEncoder {
    String inputFileName, outputFileName;
    // shift means the number added to the characters
    // example if shift = 6, input = "A", output will be "G"
    int shift;


    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

    public void readPlainFile() {
        try {
            Scanner readText = new Scanner(new FileInputStream(this.inputFileName));

            PrintWriter writeText = new PrintWriter(new FileOutputStream(this.outputFileName));

            while (readText.hasNextLine()) {
                String line = readText.nextLine();
                writeText.println(encode(line));
            }

            readText.close();
            writeText.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }

    public void readEncryptFile() {
        try {
            Scanner readText = new Scanner(new FileInputStream(this.inputFileName));

            PrintWriter writeText = new PrintWriter(new FileOutputStream(this.outputFileName));

            while (readText.hasNextLine()) {
                String line = readText.nextLine();
                writeText.println(decode(line));
            }

            readText.close();
            writeText.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }

    private final int ascii_code_max = 256;

    @Override
    public String encode(String plainText) {
        String encoded = "";

        for (int i = 0; i < plainText.length(); i++) {
            // the character is added by the value of "shift"
            // if char = 'A', shift = 3, encodedChar = D
            encoded += (char)((plainText.charAt(i) + shift) % ascii_code_max);
        }

        return encoded;
    }

    @Override
    public String decode(String cipherText) {
        String decoded = "";

        for (int i = 0; i < cipherText.length(); i++) {
            // char = 'C', shift = 2, ascii_code = 67 - 2 = 65
            int ascii_code = cipherText.charAt(i) - shift;
            if (ascii_code < 0) {
                ascii_code = ascii_code_max + ascii_code; // -4, 256 + (-4) = 252
            }

            decoded += (char)(ascii_code);
        }

        return decoded;
    }
}
