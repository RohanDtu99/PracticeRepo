package org.example.Practice;

import java.util.ArrayList;
import java.util.List;

// Understanding how List Store objects
class Students {
    private int id;
    private int age;
    private String name;

    // Constructor
    public Students(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Get id
    public int getId(){
        return id;
    }

    //get name;
    public String getName(){
        return name;
    }

    //get age;
    public int getAge(){
        return age;
    }

}

public class Student {

    public static void main(String[] args) {

        System.out.println("Hello and welcome! Array of list Concept ");

        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students(1,"akash", 26));
        studentList.add(new Students(2,"abhijit", 24));
        System.out.println(studentList.get(0).getId() + " " + "name " + studentList.get(0).getName());
        System.out.println(studentList.get(1).getId() + " " + "name " + studentList.get(1).getName() );
//        System.out.println( studentList.get(1));
        Students secondSt = studentList.get(1);
        System.out.println("Second Details ... " +  secondSt.getId() + " " + secondSt.getName() + " " + secondSt.getAge() );

    }

}

