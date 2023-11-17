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
public class Pet {

    private String petName;
    private String age;
    private String category;
    private int price;

    public void sold() {
        System.out.println("SOLD...");
    }

    public String getPetName() {
        return (petName);
    }

    public String getAge() {
        return (age);
    }

    public String getCategory() {
        return (category);
    }

    public int getPrice() {
        return (price);
    }

    public void setPetName(String name) {
        this.petName = name;

    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class PetShop {

    public static void main(String[] args) {
        Pet pet = new Pet();

        pet.setPetName("Zeeba");
        pet.setAge("1");
        pet.setCategory("Dog");
        pet.setPrice(25000);

        pet.sold();

        System.out.println("Name : " + pet.getPetName());
        System.out.println("Age : " + pet.getAge());
        System.out.println("Category : " + pet.getCategory());
        System.out.println("Price : " + pet.getPrice());
    }
}
