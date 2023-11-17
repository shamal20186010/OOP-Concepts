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
public class Product {

    public void multiply(int a, int c) {
        int count = a * c;
        System.out.println(count);
    }

    public void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }
}class Shop{
    public static void main(String[] args) {
        Product p = new Product();
        p.multiply(1, 100);
        p.multiply(1, 100, 10);
    }
}
