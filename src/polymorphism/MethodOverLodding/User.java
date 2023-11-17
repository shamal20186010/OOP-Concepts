/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.MethodOverLodding;

/**
 *
 * @author Shamal
 */
public class User {

    public void userName(String name) {
        System.out.println(name);
    }
    public void userName(String f, String l,String s){
        System.out.println(f+" "+l+" "+s+".");
    }
}class Name{
    public static void main(String[] args) {
        User user = new User();
        user.userName("Shmal");
        user.userName("Shamal", "wassana", "Fernando");
    }
}
