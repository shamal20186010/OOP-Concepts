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
public class Sum {

    public void sum(int x) {
        int y = 10;
        System.out.println(x + y);
    }

    public int sum(int x, int y) {

        return x + y;
    }

}class Main{
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.sum(100);
        System.out.println(sum.sum(20,50));
    }
}
