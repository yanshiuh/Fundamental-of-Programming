package com.FOP.FOP_Demo.Lab_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // product.txt -> cipher.txt -> plain.txt

        //this will come out with error if product.txt doesnt exist
        //in this case the input is product.txt
        //output is cipher.txt
        //shuffle times is 4
        ShuffleCipher encode = new ShuffleCipher("product.txt", "ShuffleEncrypt.txt", 2);

        //the input is cipher.txt
        //the output is plain.txt
        ShuffleCipher decode = new ShuffleCipher("ShuffleEncrypt.txt", "ShuffleDecrypt.txt", 2);

        //in this case , the product.txt and plain.txt should have the same contents
        encode.readPlainFile();
        decode.readEncryptFile();
    }
}

class ShuffleCipher implements MessageEncoder {
    String inputFileName, outputFileName;
    int shuffleTime;

    public ShuffleCipher(String inputFileName, String outputFileName, int n) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        shuffleTime = n;
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

    @Override
    public String encode(String plainText) {
        String line = plainText;
        String shuffled = "";
        System.out.println(line);

        for (int i = 0; i < this.shuffleTime; i++) {
            shuffled = "";
            int mid = line.length() / 2;

            //if String = "1234";
            //then the first half will take (0,2) = "12", last half will take(2,4) = "34"
            //if String = "12345" , mid = (int)5/2 = 2
            //then the first half will take (0,2) = "12", the last half will take (2,5) = "345"
            // 2nd parameter is exclusive
            // for example: substring(0,3) = 0,1,2
            String firstHalf = line.substring(0, mid);
            String lastHalf = line.substring(mid, line.length());

            // abcde, the cipher text will become acbde
            // ab || cde
            // acbd
            //first character of first half + first character of last half + second character of first half + second character of last half......
            for (int j = 0; j < firstHalf.length(); j++)
                shuffled = shuffled + firstHalf.charAt(j) + lastHalf.charAt(j);

            //this is the special case if the String.length is an odd number like "12345"
            //after the for loop just now , the result will be "1324" but the 5 is still missing
            //so we have to add the String shuffled , "1324" with the last character of the last part
            //abcde
            if (lastHalf.length() > firstHalf.length())
                shuffled = shuffled + lastHalf.charAt(lastHalf.length() - 1);

            //then assign the shuffled string to the line as a new input for the next shuffle
            line = shuffled;

            System.out.println(i);
            System.out.println(line);
        }
        return shuffled;
    }

    @Override
    public String decode(String cipherText) {
        String line = cipherText;
        String unshuffled = "";

        for (int i = 0; i < shuffleTime; i++) {
            unshuffled = "";

            // for example,"1324"
            if (line.length() % 2 == 0) {
                // 1324 decoded become 1234
                // get first half part (12)
                for (int j = 0; j < line.length(); j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }

                // unshuffled = 12
                // get last half part (34)
                for (int j = 1; j < line.length(); j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }
            }
            else { // "132"
                // normal text = "12345" -> "13245"
                // first half = "12", second half = "345"
                // if no -2, first half = "125", seconf half = "34" = wrong
                // get first half part
                for (int j = 0; j < line.length() - 2; j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }

                // last half part
                for (int j = 1; j < line.length(); j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }

                //special case for odd number , dont forget to add back the last character of the last half part
                //example like "13245"
                //first for loop will get "1" + "2"
                //second for loop will get "3" + "4"
                //"5" is still missing , so we need to add this line to add back the last character "5"
                //then add them together will be "12345"
                unshuffled = unshuffled + line.charAt(line.length() - 1);
            }
            line = unshuffled;
        }
        return unshuffled;
    }
}
