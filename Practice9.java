//A java program to calculate the net price of a quantity of items after availing discount
/**********************************************
*Lab session number      : 02
*Type of lab             : In Lab
*Problem No.             : 03
*Programmer              : Afrose
*Date                    : 26/10/2020
*Program name            : Practice9.java
*Topics                  : Implementation of classes and objects
************************************************/

//import required packages
import java.lang.*;
import java.util.*;

class Customer{
    String customerName;
    int customerNumber;
    double price;
    int quantity;
    double discount;
    double totalPrice;
    double netPrice;
    Scanner console = new Scanner(System.in);
    
    void init(){
        customerNumber = 101;
        customerName = "Afrose";
        quantity = 0;
        price  = 0;
        totalPrice = 0;
        netPrice = 0;
    }
    
    void input(){
        System.out.print("Enter the customer name: ");
        customerName = console.next();
        System.out.print("Enter the customer number: ");
        customerNumber = console.nextInt();
        System.out.print("Enter price: ");
        price = console.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = console.nextInt();
    }
    
    void calDiscount(){
        totalPrice = price * quantity;
        if(totalPrice>=50000){
            discount=25;
        } else if(totalPrice>=25000 && totalPrice<50000){
            discount = 15;
        } else if(totalPrice<25000){
            discount=10;
        } else{
            System.out.println("Total Price is out of range");
        }
        netPrice = totalPrice - (discount*totalPrice)/100;
    }
    
    void show(){
        System.out.println("\nCustomer Name: "+customerName);
        System.out.println("Customer Number: "+customerNumber);
        System.out.println("Price of each quantity: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Price: "+totalPrice);
        System.out.println("Discount: "+discount+"%");
        System.out.println("Net Price: "+netPrice);
    }
    
}

public class Practice9{
    public static void main(String...args){
        Customer c1 = new Customer();
        c1.init();
        c1.input();
        c1.calDiscount();
        c1.show();
    }
}