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
public class Car {

    private String brand;
    private String model;
    private String year;
    private int price;

    public void sold() {
        System.out.println("SOLD..");
    }

    public String getBrand() {
        return (brand);
    }

    public String getModel() {
        return (model);
    }

    public String getYear() {

        return (year);
    }

    public int getPrice() {
        return (price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class MOtoShop {

    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Toyota");
        car.setModel("CHR");
        car.setYear("2019");
        car.setPrice(1200000);

        car.sold();

        System.out.println("MOdel : " + car.getModel());
        System.out.println("Brand : " + car.getBrand());
        System.out.println("Year : " + car.getYear());
        System.out.println("Price : " + car.getPrice());

    }

}
