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
public class Father {
    
        String familyName = "Fernando";
        String address = "Sri Lanka";
    
    
}class Son extends Father{
    
     String name;
    
    public void myDitails(){
    
        System.out.println("My name is "+name+" "+familyName+". My Country is "+address+".");
    
    }
    
}class Family{

    public static void main(String[] args) {
        Son son = new Son();
        
        son.name = "Shamal Wassana";
        
        son.myDitails();
    }

}
