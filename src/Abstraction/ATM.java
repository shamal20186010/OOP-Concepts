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
public abstract class ATM {
    public abstract void withdrawal();
    public abstract void diposit();
    
    public void success(){
        System.out.println("Successfull...");
    }
}
class A extends ATM{
public void withdrawal(){
    System.out.println("Withdraw Successful..");
}
public void diposit(){
    System.out.println("diposit Successfull");
}

    
}class B{
    public static void main(String[] args) {
        A a = new A();
        a.diposit();
        a.withdrawal();
        a.success();
    }
}