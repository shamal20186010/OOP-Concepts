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
public class School {

    public void learn() {
        System.out.println("learnning..");
    }

    public void sports() {
        System.out.println("sports..");
    }

    public void grade() {
        System.out.println("Grade A/L");
    }

}

class Student extends School {

    public void learn() {
        System.out.println("learnning English");
    }

    public void sports() {
        System.out.println("My sport is Cricket..");
    }
}class Teacher{
    public static void main(String[] args) {
        School s1 = new Student();
        s1.learn();
        s1.sports();
        s1.grade();
    }
}
