/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Shamal
 */
public class ChocoIce {

    private String brandName;
    private String size;
    private String category;

    public void sold() {
        System.out.println("SOLD");
    }

    public String getBrandName() {
        return (brandName);
    }

    public String getSize() {
        return (size);
    }

    public String getCategory() {
        return (category);
    }

    public void setBrandName(String brand) {
        this.brandName = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

class Icecreem {

    public static void main(String[] args) {
        ChocoIce cho = new ChocoIce();
        cho.setBrandName("Magic");
        cho.setCategory("Frut and nutt");
        cho.setSize("4L");

        cho.sold();

        System.out.println("Brand Name : " + cho.getBrandName());
        System.out.println("Brand Category : " + cho.getCategory());
        System.out.println("Size : " + cho.getSize());

    }

}
