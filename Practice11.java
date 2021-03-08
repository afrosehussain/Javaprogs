//A Java program to demonstrate a given problem by implementing variables, data types, operators and control statements

/**********************************************
*Lab session number      : 01
*Type of lab             : In Lab
*Problem No.             : 04
*Programmer              : Afrose
*Date                    : 06/11/2020
*Program name            : Practice11.java
*Topics                  : Fundamentals of java programming
                           Variables, Data types, operators & Control Statements
************************************************/

//import required packages
import java.lang.*;
import java.util.Scanner;

class VendingMachine{
    byte gum;
    byte chocolate;
    byte popcorn;
    byte juice;
    int option;
    Scanner console = new Scanner(System.in);
    
    void process(){
        while(option!=6){
            System.out.print("\nEnter your choice: ");
            option = console.nextInt();
            switch(option){
                case 1:
                    gum++;
                    System.out.println("Here is your gum");
                    break;
                case 2:
                    chocolate++;
                    System.out.println("Here is your chocolate");
                    break;
                case 3:
                    popcorn++;
                    System.out.println("Here is your popcorn");
                    break;
                case 4:
                    juice++;
                    System.out.println("Here is your juice");
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error, options 1-6 only!");
            }
        }
    }
    
    void display(){
        System.out.println("\n"+gum+" items of gum sold");
        System.out.println(chocolate+" items of chocolate sold");
        System.out.println(popcorn+" items of popcorn sold");
        System.out.println(juice+" items of juice sold");
    }
}

public class Practice11{
    public static void main(String...args){
        VendingMachine v1 = new VendingMachine();
        System.out.println("-----Vending Machine Options-----");
        System.out.println("[1] Get gum");
        System.out.println("[2] Get chocolate");
        System.out.println("[3] Get popcorn");
        System.out.println("[4] Get juice");
        System.out.println("[5] Display total sold so far");
        System.out.println("[6] Quit");
        v1.process();
    }
}