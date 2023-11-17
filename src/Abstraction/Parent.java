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
public abstract class Parent {

    public abstract void talk();

    public abstract void run();

    public void sleep() {
        System.out.println("I am Sleeping");
    }

}

class Son extends Parent {

    public void talk() {
        System.out.println("I can talk..");
    }

    public void run() {
        System.out.println("I can run faster..");
    }

}

class Home {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.talk();
        s1.run();
        s1.sleep();
    }
}
