/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author Shamal
 */
public abstract class Shop {

    public abstract void Sell();

    public abstract void buy();

    public abstract void calculateBill();

}

class Shop1 extends Shop {

    public void Sell() {
        System.out.println("Sell Products..");
    }

    public void buy() {
        System.out.println("Buy Products..");
    }

    public void calculateBill() {
        System.out.println("Calculate bil..");
    }

}

class Sell {

    public static void main(String[] args) {
        Shop1 shop1 = new Shop1();
        shop1.Sell();
        shop1.calculateBill();
        shop1.buy();
    }
}
