package com.FOP_Demo.Lab_1;

public class L1Q3 {

    public static void main(String[] args) {
//                System.out.println("*********           ***             *            *");
//                System.out.println("*       *         *     *          ***          * *");
//                System.out.println("*       *        *       *        *****        *   *");
//                System.out.println("*       *        *       *          *         *     *");
//                System.out.println("*       *        *       *          *        *       *");
//                System.out.println("*       *        *       *          *         *     *");
//                System.out.println("*       *        *       *          *          *   *");
//                System.out.println("*       *         *     *           *           * *");
//                System.out.println("*********           ***             *            *");

        System.out.println("Dynamic with Size:");
        int square_size = 9;
        for (int i = 0; i < square_size; i++) {
            /*
            This if statement refers to the condition where
            it is the first line or the last line of the square shape
            */
            if (i == 0 || i == square_size - 1) {
                //If the square size is 9, then shud be having 9 stars on this line
                for (int j = 0; j < square_size; j++)
                    System.out.print("*");
            } else {
                //On these lines, stars only exist in the first and last place.
                System.out.print("*");

                //So if the size is 9, it should be having 2 starts at first and last place
                //And also 7 spaces between them which is 9 - 2 (square_size - 2)
                for (int j = 0; j < square_size - 2; j++)
                    System.out.print(" ");

                //print the last star
                System.out.print("*");
            }
            //this is to space a line
            //instead of this, u can do System.out.print("*\n");
            //\n is an escape character which refers to next line
            System.out.println();
        }

        //simply spacing 2 lines to separate it with the next shape
        System.out.println("\n\n");

    }
}
