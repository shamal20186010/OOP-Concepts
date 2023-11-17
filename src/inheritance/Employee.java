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
public class Employee {

    int basic = 60000;

}

class Engineer extends Employee {

    int salary;
    int benifit = 10000;

    public void salary() {

        System.out.println("My Salary is :");
        System.out.println("Basic : "+basic);
        System.out.println("Benifit : "+benifit);
        System.out.println(salary+basic+benifit);

    }

}class Cal{
    
    public static void main(String[] args) {
         
        Engineer en  = new Engineer();
        en.salary = 150000;
        en.salary();
        
    }

}
