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
public abstract class Class {

    public abstract void atendance();

    public abstract void in();

    public abstract void out();

    public abstract void pay();

}

class Student extends Class {

    public void atendance() {
        System.out.println("Atendance Success..");
        pay = "payed";

    }

    public void in() {
        System.out.println("Class in..");
        classRoom = "have";
    }

    String classRoom;

    public void out() {
        if (classRoom == "have") {
            System.out.println("Student in the class room");
        } else if (classRoom == "noClass") {
            System.out.println("No Class ");
        } else {
            System.out.println("Student out of class room");
        }
    }

    String pay = "notPay";

    public void pay() {
        if (pay == "notPay") {
            System.out.println("Plese Pay Money");
        } else if (pay == "payed") {
            System.out.println("Payed..");
        }
    }

}

class Class1 {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.pay();
        st1.in();
        st1.out();
        st1.atendance();
        st1.pay();
    }
}
