//A Java program to demonstrate a given problem by implementing variables, data types, operators and control statements

/**********************************************
*Lab session number      : 01
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 21/10/2020
*Program name            : Practice7.java
*Topics                  : Fundamentals of java programming
                           Variables, Data types, operators & Control Statements
************************************************/

//import required packages
import java.lang.*;
import java.util.Scanner;

class Meal{
    //Properties of meal object(adding variables)
    double baseCost;
    double tipPercent;
    double taxPercent;
    double tip;
    double tax;
    double totalCost;
    Scanner console = new Scanner(System.in);
    
    //Addinig methods to a meal class
    void read(){
        System.out.print("Enter the Base Cost of meal: ");
        baseCost=console.nextDouble();
        
        System.out.print("Tip Percent: ");
        tipPercent=console.nextDouble();
        
        System.out.print("Tax Percent: ");
        taxPercent=console.nextDouble();
    }
    void calBill(){
        tip = baseCost*(tipPercent/100);
        tax = baseCost*(taxPercent/100);
        totalCost = baseCost+tip+tax;
    }
    void display(){
        System.out.println("\nMeal base cost: "+baseCost);
        System.out.println("Tip Percentage: "+tipPercent);
        System.out.println("tax Percentage: "+taxPercent);
        System.out.println("Tip Cost: "+tip);
        System.out.println("Tax Cost: "+tax);
        System.out.println("Total cost of meal: "+(int)totalCost);
    }
}

public class Practice7{
    public static void main(String...args){
        Meal m1= new Meal();
        m1.read();
        m1.calBill();
        m1.display();
    }
}