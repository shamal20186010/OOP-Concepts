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
public class Iphone {

    private String brandName;
    private String model;
    private String country;
    private String capacity;
    private String color;
    private String year;
    private int price;

    public String getBrandName() {
        return (brandName);
    }

    public String getModel() {
        return (model);
    }

    public String getCountry() {
        return (country);
    }

    public String getCapacity() {
        return (capacity);
    }

    public String getColor() {
        return (color);
    }

    public String getYear() {
        return (year);
    }

    public int getPrice() {
        return (price);
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(int price) {

        this.price = price;
    }

}

class Phone {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.setBrandName("IPHONE");
        iphone.setModel("15 Pro Max");
        iphone.setCountry("Singapor");
        iphone.setCapacity("512GB");
        iphone.setYear("2023");
        iphone.setColor("Titanium");
        iphone.setPrice(580000);

        System.out.println("Phone : " + iphone.getBrandName());
        System.out.println("MOdel : " + iphone.getModel());
        System.out.println("Capacity : " + iphone.getCapacity());
        System.out.println("Country : " + iphone.getCountry());
        System.out.println("Year : " + iphone.getYear());
        System.out.println("Color : " + iphone.getColor());
        System.out.println("Price : " + iphone.getPrice());

    }
}
