//A Java program to demonstrate a given problem by implementing variables, data types, operators and control statements

/**********************************************
*Lab session number      : 01
*Type of lab             : In Lab
*Problem No.             : 02
*Programmer              : Afrose
*Date                    : 05/11/2020
*Program name            : InterestPractice.java
*Topics                  : Fundamentals of java programming
                           Variables, Data types, operators & Control Statements
************************************************/

//import required packages
import java.lang.*;
import java.util.Scanner;

class Bank{
    double amount;
    char bank;
    double interest;
    int flag;
    double result;
    Scanner console = new Scanner(System.in);
    
    void input(){
        System.out.print("Enter the amount of money: ");
        amount = console.nextDouble();
        System.out.print("Enter the type of Bank account: ");
        bank = console.next().charAt(0);
    }
    
    void bankCheck(char bank){
        switch(bank){
            case 'A':
            case 'a':
                interest = 1.5;
                break;
            case 'B':
            case 'b':
                interest = 2;
                 break;
            case 'C':
            case 'c':
                interest = 1.5;
                 break;
            case 'X':
            case 'x':
                interest = 5;
                 break;
            default:
                System.out.println("Invalid Account type");
                flag=1;
        }
    }
    
    void calculator(){
        result  = amount *interest/100;
    }
    
    void display(){
        System.out.println("\nAmount: "+amount);
        System.out.println("Bank account type: "+bank);
        System.out.println("Amount of money earned as interest in one year: "+result);
    }
}

public class InterestPractice{
    public static void main(String args[]){
        Bank b1 = new Bank();
        b1.input();
        b1.bankCheck(b1.bank);
        if(b1.flag==1){
            
        } else{
            b1.calculator();
            b1.display();
        }
    }
}