/**********************************************
*Case Study     : 7
*Programmer     : Afrose
*date           : 20/10/2020
*Program name   : UserInputDemo.java
*Topics         : Reading input from user in run time
************************************************/

//import required packages
import java.lang.*;
import java.util.Scanner;

//Main method class definition

public class UserInputDemo{
    public static void main(String...args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = console.next();
        System.out.print("How old are you: ");
        int age = console.nextInt();
        System.out.print("Enter your salary: ");
        double salary =  console.nextDouble();
        int retirement = 60-age;
        System.out.println("Hey "+name+"! You have "+retirement+" years to retire. Your current salary is "+salary);
    }
}