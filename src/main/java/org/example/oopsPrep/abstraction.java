package org.example.oopsPrep;


//Abstract used to hide implementation details in this example i declare a function only but it's implementation is written some other class which is inherit this abstract class
//Abstraction is about hiding implementation details and only showing essential features to the user.
//It is achieved using:
//Abstract Classes: A class declared with the abstract keyword.
// Interfaces: Fully abstract type using interface keyword in Java.

abstract class Shape{
    void draw(){}
}
class Cricle extends Shape{
    void draw(){
        System.out.println("Draw circle....");
    }
}


// Interface
interface flyable{
     void fly();
}

class Birds implements flyable{

    @Override
    public void fly() {
        System.out.println("Bird is flying in sky");
    }
}

public class abstraction {
    public static void main(String[] args) {
        System.out.println("Abstraction concept");
       Shape shape = new Cricle();
       shape.draw();

       flyable bird = new Birds();
       bird.fly();


    }
}
