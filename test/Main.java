/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shamal
 */
public class Main {

    int rows, i, j;

    public void nameLoop() {

        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Main nameLoop = new Main();

        nameLoop.nameLoop();

    }

}
