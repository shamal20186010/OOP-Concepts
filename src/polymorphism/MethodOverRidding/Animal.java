/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.MethodOverRidding;

/**
 *
 * @author Shamal
 */
public class Animal {

    public void animalSound() {
        System.out.println("Different Animal Sound..");
    }

    public void eat() {
        System.out.println("I Can Eat...");
    }

    public void run() {
        System.out.println("I can run..");
    }
}

class Cat extends Animal {

    public void animalSound() {
        System.out.println("cru..cru..");
    }
}

class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.animalSound();
        cat.eat();
        cat.run();
    }
}
