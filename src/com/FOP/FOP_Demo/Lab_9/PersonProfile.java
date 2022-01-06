package com.FOP.FOP_Demo.Lab_9;

class PersonProfile {
    String name, gender, dateOfBirth;

    public PersonProfile() {
    }

    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println();
    }
}
