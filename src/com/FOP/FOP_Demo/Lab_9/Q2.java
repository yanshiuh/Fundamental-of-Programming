package com.FOP.FOP_Demo.Lab_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Student a = new Student("Kevin Durant", "Male", "13/7/2021", "course.txt");
        a.display();
        a.displayCourseList();
        a.getGrade();
    }
}

class Student extends PersonProfile {
    String[][] courseDetails;
    String filename;

    public Student(String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        this.filename = filename;

        courseDetails = new String[countCourse()][5];
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
                for (int i = 0; i < 5; i++) {
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
            System.out.println("Mark: " + courseDetail[4]);
            System.out.println();
        }
    }

    public void getGrade() {
        System.out.println("--- Grade ---");
        String grade = "";
        for (String[] courseDetail: courseDetails) {
            if (Integer.parseInt(courseDetail[4]) >= 85) grade = "A";
            else if (Integer.parseInt(courseDetail[4]) >= 75) grade = "A-";
            else if (Integer.parseInt(courseDetail[4]) >= 70) grade = "B+";
            else if (Integer.parseInt(courseDetail[4]) >= 65) grade = "B";
            else if (Integer.parseInt(courseDetail[4]) >= 60) grade = "B-";
            else if (Integer.parseInt(courseDetail[4]) >= 55) grade = "C+";
            else if (Integer.parseInt(courseDetail[4]) >= 50) grade = "C";
            else if (Integer.parseInt(courseDetail[4]) >= 45) grade = "D";
            else if (Integer.parseInt(courseDetail[4]) >= 35) grade = "E";
            else grade = "F";

            System.out.println("Grade for " + courseDetail[0] + ": " + grade);
        }
    }
}
