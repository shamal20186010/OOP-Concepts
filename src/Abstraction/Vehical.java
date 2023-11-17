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
public abstract class Vehical {

    public abstract void start();

    public abstract void stop();

    public void run() {
        System.out.println("Run..");
    }
}

class Car extends Vehical {

    public void start() {
        System.out.println("Start..");
    }

    public void stop() {
        System.out.println("Stop..");
    }

}

class C {

    public static void main(String[] args) {
            Car car1 = new Car();
            car1.start();
            car1.run();
            car1.stop();
            
    }
}
