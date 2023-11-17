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
public class Items {

    private String itemName;
    private int itemQuantity;
    private int itemPrice;
    private int price;

    public void sold() {
        System.out.println("Solded..");
    }

    public void calculate() {

        if (itemPrice > 0) {

            int calPrice = itemPrice * itemQuantity;
            System.out.println("Price : " + calPrice);
        }else{
        
            System.out.println("Error...");
        }

    }

    public String getItemName() {
        return (itemName);
    }

    public int getItemQuantity() {
        return (itemQuantity);
    }

    public int ItemPrice() {
        return (itemPrice);
    }

    public int getPrice() {
        return (price);
    }

    public void setItemName(String name) {

        this.itemName = name;
    }

    public void setItemQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}

class Supermarket {

    public static void main(String[] args) {
        Items item = new Items();

        item.setItemName("Yoget - Hiland");
        item.setItemQuantity(30);
        item.setItemPrice(70);
        item.setPrice(50);

        item.sold();

        System.out.println("Item Name : " + item.getItemName());
        System.out.println("Item Quantity : " + item.getItemQuantity());
        System.out.println("Item Price : " + item.getPrice());
        item.calculate();

    }
}
