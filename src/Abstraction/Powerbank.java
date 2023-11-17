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
public abstract class Powerbank {

    public abstract void charge();

    public abstract void use();

    public abstract void chagingPercentage();

}

class SamsungBank extends Powerbank {

    public void charge() {
        if (percentaage >= 100) {
            System.out.println("Blink Battary Full Light");
        } else if (percentaage >= 75) {
            System.out.println("Blink Battary 75<100 Light");
        } else if (percentaage >= 50) {
            System.out.println("Blink Battary 50<75 Light");
        } else if (percentaage >= 25) {
            System.out.println("Blink Battary 25<1 Light");
        } else {
            System.out.println("Blink Battary dead.");
        }
    }

    public void use() {
        if (percentaage > 1) {
            System.out.println("Useing..");
        } else {
            System.out.println("Connect to charger..");
        }
    }

    int percentaage;

    public void chagingPercentage() {
        if (percentaage >= 100) {
            System.out.println("Blink Battary Full Light");
        } else if (percentaage >= 75) {
            System.out.println("Blink Battary 75<100 Light");
        } else if (percentaage >= 50) {
            System.out.println("Blink Battary 50<75 Light");
        } else if (percentaage >= 25) {
            System.out.println("Blink Battary 25<1 Light");
        } else {
            System.out.println("Blink Battary dead.");
        }

    }

}

class Conect {

    public static void main(String[] args) {
        SamsungBank saBank = new SamsungBank();

        saBank.percentaage = 76;
        saBank.use();
        saBank.chagingPercentage();
        saBank.charge();

    }
}
