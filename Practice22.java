//Implement handling exceptions to a given application
/**********************************************
*Lab session number      : 10
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 03-02-2021
*Program name            : Practice22.java
*Topics                  : exception fundamentals, exception keywords, types of exceptions, 
                           exception hierarchy, custom exceptions
                           try, catch, finally, throw, throws
************************************************/
//import the required packages
import java.lang.*;
import java.util.*;

class GameException extends Exception{
    public GameException(String message){
        super(message);
    }
}

class Game{
    Random r = new Random();
    int secretCode=10000+r.nextInt(100000);
    Scanner sc = new Scanner(System.in);
    int sum, digit, count;
    int n,t,g;
    public void check(){
        System.out.println("Your Secret Code is generated");
        System.out.print("Enter Guess Code: ");
        n=sc.nextInt();
        int temp=n;
        while(n>0){
            count++;
            n=n/10;
        }
        try{
            if(count!=5){
                //Usage of throw keyword
                throw new GameException("Invalid Guess Code");
            } else{
                while(temp>0){
                    t=temp%10;
                    g=secretCode%10;
                    if(t==g){
                        digit++;
                        sum=sum+t;
                    }
                    temp=temp/10;
                    secretCode=secretCode/10;
                }
                if(digit==0){
                    throw new GameException("You Lost");
                } else{
                    System.out.println("No.of digits matched: "+digit+" and Sum: "+sum);
                }
            }
        } catch(GameException e){
            e.printStackTrace();
        }
    }
}

public class Practice22{
    public static void main(String...args){
        Game g  = new Game();
        g.check();
    }
}