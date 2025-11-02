package org.example.oopsPrep;

class Car{
    String color;
    String name;
    void drive(){
        System.out.println("My new is " + name + " has a " + color + " color");
    }
}

public class NormalClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "white";
        car.name = "Thar";
        car.drive();
    }
}
