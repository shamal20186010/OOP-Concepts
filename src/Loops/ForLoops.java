/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import static java.lang.Double.sum;
import java.util.ArrayList;

/**
 *
 * @author Shamal
 */
public class ForLoops {

    public static void main(String[] args) {

        String[] list = {"Shamal", "Prabath", "Wassana", "Madusanka", "Fernando"};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Shamal");
        arrayList.add("Prabath");
        arrayList.add("Wassana");
        arrayList.add("Mhadusanka");
        arrayList.add("Fernando");

        //01 : Display a text five times
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Shamal");

        }

        //2 : Display numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //3 : Display sum of natural numbrrs from 0 to 1000
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        //04 : Print christmas tree
        for (int i = 0; i < 10; i++) {
            for (int s = 10; s > i; --s) {
                System.out.print(" ");
            }

            for (int a = 0; a < i; a++) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println("");
        }

        for (int i = 0; i < 10; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int a = 10; a > i; a--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        //4. Print / using 20 itwrations
        for (int a = 0; a < 20; a++) {
            System.out.print("/");
        }
        System.out.println(" ");
        //5. Print \ using 20 iterations
        for (int i = 0; i < 20; i++) {
            System.out.print("/");

        }

        for (int i = 0; i <= 5; i++) {
            System.out.print("A");
            for (int b = 0; b <= 5; b++) {
                System.out.print("B");
            }
            System.out.print("C");
            System.out.println(" ");
        }

    }

}
