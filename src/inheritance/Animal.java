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
class Animal{

String name;

public void eat(){

System.out.println("I can eat..");

}

}class Dog extends Animal{

public void display(){

System.out.println("My name is "+name);

}

}class Main{

public static void main(String[] args){

Dog dog = new Dog();

dog.name = "seeba";
dog.display();

dog.eat();

}

}