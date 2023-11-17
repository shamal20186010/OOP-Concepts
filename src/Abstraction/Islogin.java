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
public abstract class Islogin {

    public abstract void isLogin();

    public abstract void register();

    public void logout() {
        System.out.println("Logout Success..");
    }

}

class User extends Islogin {

    String user;

    public void isLogin() {
        if (user == "isLogin") {
            System.out.println("Login Success..");
        } else {
            System.out.println("Plese Register..");
        }
    }

    public void register() {
        System.out.println("Register Success..");
        user = "isLogin";
    }
}

class Login {

    public static void main(String[] args) {
        User user = new User();
        user.isLogin();
        user.register();
        user.isLogin();
        user.logout();

    }
}
