/*a Java program to read a string and if a substring of length two appears at both its beginning and end, return a string without the substring at the beginning otherwise, return the original string unchanged*/
/**********************************************
*Lab session number      : 04
*Type of lab             : Post Lab
*Problem No.             : 02
*Programmer              : Afrose
*Date                    : 19/01/2021
*Program name            : SameSubstring.java
*Topics                  : String, BufferString,String methods
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class SubString{
    String input;
    Scanner sc = new Scanner(System.in);
    
    public void getInput(){
        System.out.print("The given string is: ");
        input = sc.nextLine();
    }
    
    public void subStringChecker(){
        int l = 0;
        int r = input.length();
        if(input.charAt(0)==input.charAt(input.length()-2) && input.charAt(1)==input.charAt(input.length()-1))
        {
            l=2;
        }
        System.out.println(input.substring(l,r));
    }
}
public class SameSubstring {
    public static void main(String args[]){
        SubString s1 = new SubString();
        s1.getInput();
        s1.subStringChecker();
    }

}