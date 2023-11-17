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
public class Meth_Overlodding {
    
    public void method1(){
        System.out.println("method1");
    }
    
    public void method1(String i){
        System.out.println("method2");
    }
    
    public void method1(int x){
        System.out.println("method3");
    }
    
    
    public static void main(String[] args) {
        Meth_Overlodding meth = new Meth_Overlodding();
        
        meth.method1(5);
    }
    
}
