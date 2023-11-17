/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Shamal
 */
public class IceCrem {

    String name;
    String catagory;
    String liter;

    public void eat() {

        System.out.println("I eat Icecreem..");

    }

}

class CupIce extends IceCrem {

    public void liter() {
        System.out.println(name);
        System.out.println(liter);

    }

}

class CornIce extends IceCrem {

    public void flever() {
        System.out.println(name);
        System.out.println(catagory);

    }

}

class Ice {

    public static void main(String[] args) {
        CupIce cupI = new CupIce();
        cupI.name = "Carmello";
        cupI.liter = "4L";
        cupI.liter();

        CornIce cornI = new CornIce();
        cornI.name = "Sisira";
        cornI.catagory = "Chocalet and Wanila";
        cornI.flever();
    }

}
