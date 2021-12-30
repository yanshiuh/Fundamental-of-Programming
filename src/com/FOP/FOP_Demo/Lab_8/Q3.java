package com.FOP.FOP_Demo.Lab_8;

public class Q3 {

    public static void main(String[] args) {
        WeightCalculator a = new WeightCalculator(20, 169);
        a.calculateRW();
        System.out.println(a);
    }
}

class WeightCalculator {
    private int age;
    private double height;
    private double recommendedWeight;

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public void calculateRW() {
        recommendedWeight = (height - 100 + (double) (age/10)) * 0.9;
    }

    @Override
    public String toString() {
        return  "age = " + age +
                ", height = " + height +
                "cm, recommendedWeight = " + recommendedWeight +
                "kg";
    }
}
