//a Java program to check whether a string is pq-balanced or not. A String is pq-balanced if for all the p's in the string at least one 'q' must exists right of the p's. But 'q' before the 'p' makes the pq-balanced false*/
/**********************************************
*Lab session number      : 04
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 19/01/2021
*Program name            : PQBalanced.java
*Topics                  : String, BufferString,String methods
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class PQString{
    String input;
    Scanner sc = new Scanner(System.in);
    
    public void getInput(){
        System.out.print("The given string is: ");
        input = sc.nextLine();
    }
    
    public void balanceChecker(){
        int index_p =-1;
        int index_q = -1;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='q'){
                index_q = i;
                break;
            }
        }
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='p'){
                index_p = i;
                break;
            }
        }
        System.out.print("The string is pq-balanced? ");
        System.out.println(index_p<index_q?"True":"False");
    }
}
public class PQBalanced{
    public static void main(String...args){
       PQString p1 = new PQString();
        p1.getInput();
        p1.balanceChecker();
    }
}