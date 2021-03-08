//A Java program to demonstrate a given problem of guessing a number by implementing variables, data types, operators and control statements

/**********************************************
*Lab session number      : 01
*Type of lab             : Post Lab
*Problem No.             : 02
*Programmer              : Afrose
*Date                    : 05/11/2020
*Program name            : PlumberSavings.java
*Topics                  : Fundamentals of java programming
                           Variables, Data types, operators & Control Statements, Escape sequences
************************************************/

//import required packages
import java.lang.*;

class BankActivity{
    double amount  = 100000;
    int month;
    double interestRate;
    double interest;
    
    void calculation(){
        for(month=1;month<=12;month++){
            if(amount<=110000){
                interestRate=0.01; 
            } else if(amount>110000 && amount<=125000){
                interestRate=0.015;
            } else if(amount>125000){
                interestRate=0.02;
            } else{
                System.out.println("Invalid");
            }
            interest = amount*interestRate;
            amount = amount+interest;
           
           if(month!=12){       System.out.println(month+"\t"+interestRate+"\t\t"+String.format("%.2f",interest)+"\t\t\t"+String.format("%.2f",amount));
         } else{
               System.out.println(month+"\t"+interestRate+"\t\t"+String.format("%.2f",interest)+"\t\t\t"+String.format("%.2f",amount+1000));
           }
            amount = amount + 1000;
        }
    }
}

public class PlumberSavings{
    public static void main(String args[]){
        BankActivity b1 = new BankActivity();
        System.out.println("Month\tInterest Rate\tAmount of interest\tNew Balance");
        b1.calculation();
    }
}