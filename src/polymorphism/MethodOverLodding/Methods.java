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
public class Methods {

    public void m(String a, String b) {
        System.out.println(a + b);
    }

    public void m(int a, int b) {
        System.out.println(a + b);
    }

    public void m() {
        System.out.println("m");
    }

    public void m(String a, int b) {
        System.out.println(a + b);
    }

}class M {
    public static void main(String[] args) {
        Methods m1 =new Methods();
        m1.m();
        m1.m("A","B");
        m1.m("A", 10);
        m1.m(100, 10);
    }
}
