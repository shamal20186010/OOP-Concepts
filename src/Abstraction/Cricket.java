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
public abstract class Cricket {

    public abstract void ball();

    public abstract void bat();

    public abstract void feald();

    String run = "95";

    public void run() {
        System.out.println("Runs : " + run);
    }
}

class Team extends Cricket {

    public void ball() {
        System.out.println("Ball");
    }

    public void bat() {
        System.out.println("bat");
    }

    public void feald() {
        System.out.println("feald");
    }
}

class T20 {

    public static void main(String[] args) {
        Team team = new Team();
        team.ball();
        team.bat();
        team.feald();
        team.run();
    }
}
