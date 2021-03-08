//A java program that demonstrates the use of constructors, classes and objects with an invoice example
/**********************************************
*Lab session number      : 02
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 08/11/2020
*Program name            : InvoiceTest.java
*Topics                  : Implementation of classes and objects
************************************************/

//import required packages
import java.lang.*;
import java.util.*;

class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double price;
    Scanner console = new Scanner(System.in);
    
    Invoice(){
        partNumber = null;
        partDescription = null;
        quantity = 0;
        price = 0.0;
    }
    
    void get(){
        System.out.print("Enter Part Number: ");
        partNumber = console.next();
        System.out.print("Enter Part Description: ");
        partDescription = console.next();
        System.out.print("Enter quantity: ");
        quantity = console.nextInt();
        System.out.print("Enter price: ");
        price = console.nextDouble();
    }
    
    void set(){
        if(quantity<0){
            quantity=0;
        }
        if(price<0){
            price=0.0;
        }
    }
    
    double getInvoice(){
        double totalCost = quantity*price;
        return totalCost;
    }
    
    void display(){
        System.out.println("\nPart Number: "+partNumber);
        System.out.println("Part Description: "+partDescription);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total invoice amount: "+getInvoice());
    }
}

public class InvoiceTest{
    public static void main(String...args){
        Invoice i1 = new Invoice();
        i1.get();
        i1.set();
        i1.display();
    }
}