/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Shamal
 */
public class Patient {
    
    private String name;
    private String age;
    private String description;
    
    
    public void admit(){
    
        System.out.println("IS ADMIT "+name);
    }
    
    public String getName(){
    return(name);
    }
    public String getAge(){
    return(age);
    }
    public String getDescription(){
    return(description);
    }
    
    public void setName(String name){
    this.name = name;
    }
    public void setAge(String age){
    this.age = age;
    }
    public void setDescription(String description){
    this.description = description;
    }
}
class Hospital{

    public static void main(String[] args){
    
        Patient patient = new Patient();
        patient.setName("Kamal");
        patient.setAge("54");
        patient.setDescription("una");
        
        patient.admit();
        
        System.out.println("Name : "+patient.getName());
        System.out.println("Age : "+patient.getAge());
        System.out.println("Description : "+patient.getDescription());
        
    }
    
}
