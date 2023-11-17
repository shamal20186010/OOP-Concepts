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
public class Meth_Overriding {
    
    public void phone(){
    
        System.out.println("Samsung");
    }
    
    
    
}class Me extends Meth_Overriding{

    public void phone(){
        System.out.println("Nokia");
    
    }
    
    public static void main(String[] args) {
        Meth_Overriding i = new Me();
        i.phone();
    }

}
