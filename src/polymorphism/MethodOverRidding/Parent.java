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
public class Parent {
    
    public void surName(){
        System.out.println("Fernando..");
    }
    
    public void eat(){
        System.out.println("Eating");
    }
    public void drink(){
        System.out.println("Drinking");
    }
}class Son extends Parent{
public void eat(){
    System.out.println("I eat Rice..");
}
public void drink(){
    System.out.println("I drink in water..");
}
}class Family{
    public static void main(String[] args) {
        Parent son = new Son();
        son.surName();
        son.eat();
        son.drink();
        
    }
}
