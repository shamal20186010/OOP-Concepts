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
public class Novels {

    private String bookName;
    private String category;
    private String year;
    private int code;
    private String bookHolderName;
    private String bookHolderCon;
    private String bookHolderEmail;

    public void Holder() {
        System.out.println("Holder Name : " + bookHolderName);
        System.out.println("Holder Email : " + bookHolderEmail);
        System.out.println("Holder Contact NO : " + bookHolderCon);

    }

    public String getBookName() {
        return (bookName);
    }

    public String getCategory() {
        return (category);
    }

    public String getYear() {
        return (year);
    }

    public int getCode() {
        return (code);
    }

    public String getBookHolderName() {
        return (bookHolderName);
    }

    public String getBookHolderEmail() {
        return (bookHolderEmail);
    }

    public String getBookHolderCon() {
        return (bookHolderCon);
    }

    public void setBookName(String name) {
        this.bookName = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setYera(String year) {
        this.year = year;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setBookHolderName(String holderName) {
        this.bookHolderName = holderName;
    }

    public void setBookHolderEmail(String holderEmail) {
        this.bookHolderEmail = holderEmail;
    }

    public void setBookHolderCon(String holderCon) {
        this.bookHolderCon = holderCon;
    }

}

class Library {

    public static void main(String[] args) {
        Novels novel = new Novels();
        novel.setBookName("Boda Meedum");
        novel.setCategory("romantic");
        novel.setYera("2006");
        novel.setCode(1105480);
        novel.setBookHolderName("Shamal Wassana");
        novel.setBookHolderEmail("shmal@gmail.com");
        novel.setBookHolderCon("0769257284");

        System.out.println("Book Name : " + novel.getBookName());
        System.out.println("Book Cate : " + novel.getCategory());
        System.out.println("Book Year : " + novel.getYear());
        System.out.println("Book Code : " + novel.getCode());
        novel.Holder();

    }
}
