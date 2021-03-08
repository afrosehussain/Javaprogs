//A Java program to demonstrate a given problem of guessing a number by implementing variables, data types, operators and control statements

/**********************************************
*Lab session number      : 01
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 22/10/2020
*Program name            : Practice8.java
*Topics                  : Fundamentals of java programming
                           Variables, Data types, operators & Control Statements, Escape sequences
************************************************/

//import required packages
import java.lang.*;
import java.util.*;

class GuessNumber{
    //Adding a method to determine the guess number with secret number
    public String determineGuess(int userNumber,int secretNumber,int count){
        if(userNumber<0 || userNumber>100){
            return "\nYour guess is invalid!";
        } else if(userNumber == secretNumber){
            return "\nCorrect!! You won \nTotal Guesses: "+count;
        } else if(userNumber<secretNumber){
            return "\nYour guess is Too Low, try again.\nTry number: "+count;
        } else if(userNumber>secretNumber){
            return "\nYour guess is Too High, try again.\nTry number: "+count;
        } else{
            return "\nYour guess is incorrect.\nTry number: "+count;
        }
    }
}

public class Practice8{
    public static void main(String...args){
        Scanner console = new Scanner(System.in);
        int secretNumber = (int)(Math.random()*100)+1;    //random number from 1 to 100 
        int userNumber=0;
        GuessNumber g1 = new GuessNumber();
        int count =1;
        while(userNumber!=secretNumber){
            System.out.print("\nEnter your guess between 1 and 100: ");
            userNumber = console.nextInt();
            String result = g1.determineGuess(userNumber, secretNumber, count);
            System.out.println(result);
            count++;
        }
        
    }
}