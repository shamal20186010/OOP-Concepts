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
public class Bick {
    
    public void run(){
        System.out.println("Running");
    }
    
}class Yamaha extends Bick{

    public void run(){
        System.out.println("Yamaha Bick is Running..");
    }
    
}class Test{
    public static void main(String[] args) {
        Bick b1 = new Yamaha();
        b1.run();
    }
}
