/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Shamal
 */
public class Vehical {
    
    String name;
    
    public void drive(){
        
        System.out.println("I am drive..");
    }
    
}class Car extends Vehical{

    public void display(){
        System.out.println("My name is "+ name);
    }
     

}



class Test{
    
    public static void main(String[] args) {
        Car car = new Car();
        
        car.name = "BMW";
        car.drive();
        car.display();
    }

}
