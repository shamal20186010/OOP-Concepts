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
public class Users {

    private String userName;
    private String conNo;
    private int age;
    private String email;

    public void islogin() {

        System.out.println("Loged..");

    }

    public String getUserName() {

        return (userName);
    }

    public String getConNo() {

        return (conNo);
    }

    public String getEmail() {

        return (email);
    }

    public int getAge() {

        return (age);
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public void setConNo(String conNo) {

        this.conNo = conNo;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main{

    public static void main(String[] args){
    
        Users user = new Users();
        
        user.setUserName("Shamal");
        user.setConNo("0769257284");
        user.setAge(23);
        user.setEmail("shamal@gmail.com");
        
        user.islogin();
        
        System.out.println("Name : "+user.getUserName());
        System.out.println("Con NO : "+user.getConNo());
        System.out.println("Age : "+user.getAge());
        System.out.println("Email : "+user.getEmail());
        
    }
    
    
}

