/*a Java program to check the validity of password input by users*/
/**********************************************
*Lab session number      : 04
*Type of lab             : In Lab
*Problem No.             : 03
*Programmer              : Afrose
*Date                    : 19/01/2021
*Program name            : PasswordChecker.java
*Topics                  : String, BufferString,String methods
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class Validator{
    String password;
    String[] arrOfPass;
    Scanner sc = new Scanner(System.in);
    
    public void getter(){
        System.out.print("Enter password: ");
        password = sc.nextLine();
    }
    
    public void checker(){
        arrOfPass = password.split(", ");
        int count=0;
        for(int i=0;i<arrOfPass.length;i++){
            if(arrOfPass[i].matches(".*[a-z]{1,}.*") && arrOfPass[i].matches(".*[A-Z]{1,}.*") && arrOfPass[i].matches(".*[0-9]{1,}.*") && arrOfPass[i].matches(".*[$#@]{1,}.*") && arrOfPass[i].length()>=6 && arrOfPass[i].length()<=12){
                System.out.println(arrOfPass[i]);
                count++;
            } 
            if(count==0){
                System.out.println("Invalid password");
            }
        }
    }
}

public class PasswordChecker{
    public static void main(String...args){
        Validator v1 = new Validator();
        v1.getter();
        v1.checker();
    }
}