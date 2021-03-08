//a java program to implement interfaces
/**********************************************
*Lab session number      : 06
*Type of lab             : In Lab
*Problem No.             : 02
*Programmer              : Afrose Hussain
*Date                    : 03/02/2021
*Program name            : ToTestInt.java
*Topics                  : Implementation of Interfaces, interface, implements, defining an interface
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

interface Test{
    double square(double a);
}

class Arithmetic implements Test{
    public double square(double a){
        return a * a;
    }
}

public class ToTestInt {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        Arithmetic a = new Arithmetic();
        
        System.out.print("Enter a Number: ");
        double n = sc.nextDouble();
        System.out.println("Square of " + n + " is " + a.square(n));
    }
}