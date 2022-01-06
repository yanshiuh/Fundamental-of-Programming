package com.FOP.FOP_Demo.Lab_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Lecturer a = new Lecturer("Dr. Lim", "Male", "20/3/1995", "lecturer.txt");
        a.display();
        a.displayCourseList();
        a.computeCreditHour();
    }
}

class Lecturer extends PersonProfile {
    String[][] courseDetails;
    String filename;

    public Lecturer() {
    }

    public Lecturer(String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        this.filename = filename;

        courseDetails = new String[countCourse()][6];
        this.getCourseDetails();
    }

    public void getCourseDetails() {
        try {
            Scanner readFile = new Scanner(new FileInputStream(filename));

            while (readFile.hasNextLine()) {
                for (String[] courseDetail: courseDetails) {
                    for (int i = 0; i < courseDetail.length; i++) {
                        courseDetail[i] = readFile.nextLine();
                    }
                }
            }

            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }

    public int countCourse() {
        int count = 0;
        try {
            Scanner readFile = new Scanner(new FileInputStream(filename));

            while (readFile.hasNextLine()) {
                for (int i = 0; i < 6; i++) {
                    readFile.nextLine();
                }
                count++;
            }

            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }

        return count;
    }

    public void displayCourseList() {
        for (String[] courseDetail: courseDetails) {
            System.out.println("Course code: " + courseDetail[0]);
            System.out.println("Course name: " + courseDetail[1]);
            System.out.println("Session: " + courseDetail[2]);
            System.out.println("Semester: " + courseDetail[3]);
            System.out.println("Credit hour: " + courseDetail[4]);
            System.out.println("Number of students: " + courseDetail[5]);
            System.out.println();
        }
    }

    public void computeCreditHour() {
        System.out.println("--- Updated Credit Hour ---");
        double updatedCreditHour = 0;
        for (String[] courseDetail: courseDetails) {
            int creditHour = Integer.parseInt(courseDetail[4]);

            if (Integer.parseInt(courseDetail[5]) >= 150) updatedCreditHour = creditHour * 3;
            else if (Integer.parseInt(courseDetail[5]) >= 100) updatedCreditHour = creditHour * 2;
            else if (Integer.parseInt(courseDetail[5]) >= 50) updatedCreditHour = creditHour * 1.5;
            else updatedCreditHour = creditHour;

            System.out.println("Updated credit hour: " + updatedCreditHour);
        }
    }
}


