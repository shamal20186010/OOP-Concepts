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
public class Country {
    
    String name;
    int countOfPeoples;
    
    public void workers(){
        System.out.println("I am a Worker..");
    }
    
    public void sportsMan(){
        System.out.println("I am a SportsMan");
    }
    
    public void teacher(){
        System.out.println("I am a Teacher");
    }
    
    
}class SriLanka extends Country{

    public void disPlay(){
    
        System.out.println("My Country is "+name+"."+"Count Of "+countOfPeoples+" Peoples in our Country.");
    
    }

}class India extends Country{

    public void display(){
    
         System.out.println("My Country is "+name+"."+"Count Of "+countOfPeoples+" Peoples in our Country.");
    
    }

}class A {

    public static void main(String[] args) {
        SriLanka sl = new SriLanka();
        India in = new India();
        
        sl.name = "Sri Lanka";
        sl.countOfPeoples = 200000000;
        sl.disPlay();
        
        in.name = "India";
        in.countOfPeoples = 1000000000;
        in.display();
    }

}
