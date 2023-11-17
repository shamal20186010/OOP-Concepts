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
public class School {

    protected String name;
    protected String gender;
    protected String grade;
    protected String subject;

    public void learnning() {

        System.out.println("I am learnning...");

    }

    public void teaching() {

        System.out.println("I am teaching...");

    }

}

class Teacher extends School {

    public void subject() {

        System.out.println("I am teacher at " + name + " My subject is " + subject + ".");

    }

}

class Student extends School {

    public void disPlay() {

        System.out.println("I am Student at " + name + " I am grade " + grade + ".");

    }

}

class Session {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.teaching();
        teacher.name = "Sri Panagananda College";
        teacher.subject = "ICT";
        teacher.subject();

        Student student = new Student();
        student.learnning();
        student.name = "Sri Panagananda College";
        student.grade = "A/L";
        student.disPlay();

    }

}
