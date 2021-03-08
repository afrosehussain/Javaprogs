//A Java program which uses a for loop to compute the balance after a year of compounding interest

/**********************************************
*Lab session number      : 01
*Type of lab             : Post Lab
*Problem No.             : 03
*Programmer              : Afrose
*Date                    : 06/11/2020
*Program name            : CompInterest.java
*Topics                  : Fundamentals of java programming
                           Variables, Data types, operators & Control Statements, Escape sequences
************************************************/

//import required packages
import java.lang.*;

class Invest{
    double amount = 1000;
    double interest;
    
    void calculation(){
        int month=1;
        for(month=1;month<=12;month++){
            interest = amount*0.01;
            amount = amount+interest;
        }
        System.out.println("\nThe balance after a year of compounding interest is $"+String.format("%.2f",amount));
    }
}

public class CompInterest{
    public static void main(String...args){
        Invest i1 = new Invest();
        i1.calculation();
    }
}