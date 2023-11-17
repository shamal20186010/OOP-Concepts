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
abstract class Phone {

    public abstract void call();

    public abstract void message();

    public void wachVideo() {
        System.out.println("I can Play videos...");
    }

    public void sleep() {
        System.out.println("I'm sleep");
    }

}

class Samsung extends Phone {

    @Override
    public void call() {
        System.out.println("I can Call");
    }

    @Override
    public void message() {
        System.out.println("I can Message");
    }

}

class Test {

    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        s1.call();
        s1.message();
        s1.sleep();
    }
}
