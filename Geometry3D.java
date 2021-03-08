//a java program to implement interfaces
/**********************************************
*Lab session number      : 06
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 03/02/2021
*Program name            : Geometry3D.java
*Topics                  : Implementation of Interfaces, interface, implements, defining an interface
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

interface Shape3D{
    double getVolume();
}

class Cuboid implements Shape3D{
    private double length, breadth, height;
    public Cuboid(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }
    
    public double getVolume(){
        return length * breadth * height;
    }
}

public class Geometry3D{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter dimensions: ");
        String data = sc.nextLine();
        String[] s = data.split(" ");
        
        if (s.length != 3){
            System.out.println("Invalid number");
        }else{
            Cuboid c = new Cuboid(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
            System.out.println("Volume is " + c.getVolume());
            
            
        }
	}
}