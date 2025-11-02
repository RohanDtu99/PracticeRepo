package org.example.oopsPrep;

class BankAccount{
    private double balance;

    //setter
     public void setBalance(double amount){
        balance = amount;
        if(amount <= 0){
            balance = -1;
        }
    }
    // getter
    public double getBalance(){
        return balance;
    }
}
//
//Encapsulation refers to bundling data (fields) and methods (functions) that operate on the data within one unit (class) and restricting direct access to some of an object’s components.
//You achieve this by using private access modifiers for class variables and public methods (getters/setters) for access.

public class encapsulation {
    public static void main(String[] args) {
      BankAccount account = new BankAccount();
      account.setBalance(500);
        System.out.println("Updated balance is " + account.getBalance());
    }
}
