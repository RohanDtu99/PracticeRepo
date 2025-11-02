package org.example.oopsPrep;

//Polymorphism means "many forms." It allows a single interface (method) to represent different forms of behavior. There are two types of polymorphism in Java:
//Compile-time (Method Overloading):
//Multiple methods with the same name but different parameters.
//Runtime (Method Overriding):
//A method in child class overrides a parent class method with the same signature.
// Method overloading
class Calculator{
    public int add(int a , int b){
        return a + b;
    }
    public double add(double a , double b){
        return a + b;
    }
    public int add(int a , int b , int c){
        return a + b + c;
    }
}

// method overiding
class ModifiedCalcualtor extends Calculator{
    @Override
    public int add(int a1, int b1) {
        int c = 40;
        a1 += c;
        System.out.println("Modified Calculator");
       return a1 + b1;
    }
}


public class polymorphism {
    public static void main(String[] args) {
        System.out.println("Polymorphism concept");
        Calculator calculator = new Calculator();
        ModifiedCalcualtor modifiedCalcualtor = new ModifiedCalcualtor();
        System.out.println("Addtion of two integer values " + calculator.add(5,5));
        System.out.println("Addtion of two double values " + calculator.add(50.0,7));
        System.out.println("Addtion of three integer values " + calculator.add(50,5 , 7));
        System.out.println("Method Overriding  " + modifiedCalcualtor.add(4,56 ));

    }
}
