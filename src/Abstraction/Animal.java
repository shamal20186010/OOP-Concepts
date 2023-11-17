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
abstract class Animal {

    public abstract void animalSound();

    public void sleep() {

        System.out.println("zzzzz");
    }

}

class Dog extends Animal {

    public void animalSound() {

        System.out.println("bow bow");

    }

}

class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }

}
