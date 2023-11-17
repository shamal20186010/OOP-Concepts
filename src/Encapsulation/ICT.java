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
public class ICT {

    private String studentName;
    private String year;
    private String subject;
    private int code;
    private int price;
    private String teacher;

    public void payment() {

        System.out.println("Name : " + studentName);
        System.out.println("Code : " + code);
        System.out.println("Year : " + year);
        System.out.println("Subject : " + subject);
        System.out.println("Subject Teacher : " + teacher);
        System.out.println("Subject Price : " + price);

    }

    public String getStudentName() {
        return (studentName);
    }

    public String getYear() {
        return (year);
    }

    public String getsubject() {
        return (subject);
    }

    public int getCode() {
        return (code);
    }

    public int getPrice() {
        return (price);
    }

    public String getTeacher() {
        return (teacher);
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}

class Class {

    public static void main(String[] args) {
        ICT it = new ICT();
        it.setSubject("ICT");
        it.setTeacher("Banuka ekanayaka");
        it.setStudentName("Shamal");
        it.setCode(12384135);
        it.setYear("2023");
        it.setPrice(2500);

        it.payment();
    }
}
