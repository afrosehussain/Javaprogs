/*a Java program to enter and confirm a suitable code name for an agent*/
/**********************************************
*Lab session number      : 04
*Type of lab             : In Lab
*Problem No.             : 02
*Programmer              : Afrose
*Date                    : 18/01/2021
*Program name            : CodeChecker.java
*Topics                  : String, BufferString,String methods
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class Agent{
    String codeName;
    String confirmName;
    Scanner sc=new Scanner(System.in);
    
    public void getCode(){
        while(true){
            System.out.print("Enter the code: ");
            codeName = sc.nextLine();
            int i=0;
            for(char c: codeName.toCharArray()) {
         			i++;
      			}
            if(i<=6){
                System.out.println("INVALID CODENAME");
            } else{
                break;
            }
        }
    }
    
    public void confirm(){
         while(true){
            System.out.print("Re-enter the code: ");
            confirmName = sc.nextLine();
            if(codeName.equals(confirmName)){
                System.out.println("CODE NAME CONFIRMED");
                break;
            } else{
                System.out.println("CODE NAME MIS-MATCH");
            }
         }
    }
    
    public void checkConditions(){
        int len = codeName.length();
        if(codeName.charAt(len-1)=='X' && codeName.startsWith("Agent") && len>6){
            System.out.println("The given code is Suitable for an Agent");
        } else{
            System.out.println("The given code is not Suitable for an Agent");
        }
    }
}

public class CodeChecker{
    public static void main(String...args){
        Agent a1 = new Agent();
        a1.getCode();
        a1.confirm();
        a1.checkConditions();
    }
}