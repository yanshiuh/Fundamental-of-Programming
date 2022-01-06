package com.FOP.FOP_Demo.Lab_9;

public class Q1 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle 1",8,10);
        rectangle.computeArea();
        rectangle.computePerimeter();
        rectangle.display();

        System.out.println("\n");

        rectangle.acceptInput(12,14);
        rectangle.computeArea();
        rectangle.computePerimeter();
        rectangle.display();

        System.out.println("\n");

        Square square = new Square("Square 1",20);
        square.computeArea();
        square.computePerimeter();
        square.display();

        System.out.println("\n");

        Circle circle = new Circle("Circle 1",10);
        circle.computeArea();
        circle.computePerimeter();
        circle.display();
    }
}

class Shape {
    String name;
    double perimeter, area;

    public Shape() {
        name = null;
        perimeter = 0;
        area = 0;
    }

    public Shape(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void display() {
        System.out.printf("Shape: %s \nPerimeter: %.2f \nArea: %.2f", name, perimeter, area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public void acceptInput(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computePerimeter() {
        this.setPerimeter((length + width) * 2);
    }

    public void computeArea() {
        this.setArea(length * width);
    }
}

class Square extends Shape {
    double sideLength;

    public Square() {
        super();
        sideLength = 0;
    }

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    public void acceptInput(double sideLength) {
        this.sideLength = sideLength;
    }

    public void computePerimeter() {
        this.setPerimeter(sideLength * 4);
    }

    public void computeArea() {
        this.setArea(sideLength * sideLength);
    }
}

class Circle extends Shape {
    double diameter;

    public Circle() {
        super();
        diameter = 0;
    }

    public Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }

    public void acceptInput(double diameter) {
        this.diameter = diameter;
    }

    public void computePerimeter() {
        this.setPerimeter(2 * Math.PI * (diameter / 2));
    }

    public void computeArea() {
        this.setArea(Math.PI * Math.pow(diameter / 2, 2));
    }
}
