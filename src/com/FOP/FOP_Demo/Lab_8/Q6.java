package com.FOP.FOP_Demo.Lab_8;

public class Q6 {

    public static void main(String[] args) {
        BurgerStall a = new BurgerStall("A123");
        a.sold(30);
        BurgerStall b = new BurgerStall("B234");
        b.sold(35);

        a.display();
        b.display();

        a.displayTotal();
    }
}

class BurgerStall {
    private String ID;
    private int sold_per_stall;
    private static int sold;

    public BurgerStall(String ID) {
        this.ID = ID;
    }

    public void sold(int amount) {
        sold_per_stall += amount;

        sold += amount;
    }

    public void display() {
        System.out.println("Total sold by stall " + this.ID + ": " + this.sold_per_stall);
    }

    public void displayTotal() {
        System.out.println("Total sold by all stall(s): " + sold);
    }
}
