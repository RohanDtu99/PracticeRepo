package org.example.oopsPrep;

class Vehicle {
    public String type = "";
    public void start() {
        System.out.println("Start Engine");
    }
};

class Cars extends Vehicle {
    public void drive(){
        type = "suv";
        System.out.println("Drive Car... " + type );
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.start();
        cars.drive();
    }
}
