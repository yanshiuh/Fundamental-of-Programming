package com.FOP.FOP_Demo.Lab_10;

public class Q1 {

    public static void main(String[] args) {
        Employee worker1 = new permanentEmployee("Kevin", 'A');
        Employee worker2 = new contractStaff("James", 2000);
        Employee worker3 = new temporaryStaff("Linda", 5);
        worker1.display();
        worker2.display();
        worker3.display();
    }
}

abstract class Employee {
    String name;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    abstract void display();
}

class permanentEmployee extends Employee {
    char category;

    public permanentEmployee(String name, char category) {
        super(name);
        this.category = category;
        if (category == 'A') this.salary = 4000;
        else if (category == 'B') this.salary = 3000;
        else if (category == 'C') this.salary = 2000;
    }

    @Override
    void display() {
        System.out.printf("A permanent employee named %s with the salary RM%.2f \n", this.name, this.salary);
    }
}

class contractStaff extends Employee {
    double totalSales;

    public contractStaff(String name, double totalSales) {
        super(name);
        this.totalSales = totalSales;
        this.salary = 500 + (totalSales * 0.5);
    }

    @Override
    void display() {
        System.out.printf("A contract employee named %s with the salary RM%.2f \n", this.name, this.salary);
    }
}

class temporaryStaff extends Employee {
    int hour;

    public temporaryStaff(String name, int hour) {
        super(name);
        this.hour = hour;
        this.salary = 15 * hour;
    }

    @Override
    void display() {
        System.out.printf("A temporary employee named %s with the salary RM%.2f \n", this.name, this.salary);
    }
}