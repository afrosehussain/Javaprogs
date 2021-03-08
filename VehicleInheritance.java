/*A An automobile base class with cars, trucks as child classes, complete with parameters constructors which pass the parents member variables to the child class*/
/**********************************************
*Lab session number      : 04
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 16/01/2021
*Program name            : VehicleInheritance.java
*Topics                  : Variables, Data types, Conrol statements, operators
                            Classes, Objects, constructors, inheritance & its types
                            this and super keyword
                            Method Overriding
************************************************/


//import the required packages
import java.lang.*;
import java.util.Scanner;

class Automobile{
        String make = "unknown";
		String yr_model = "unknown"; 
		double mileage = 0.0;
		double price = 0.0;
		
		public Automobile(String m,String y_m,double mil,double p){
		    make = m;
		    yr_model = y_m;
		    mileage = mil;
		    price = p;
		}

        public void display(){
            System.out.println("Make = " + make);
            System.out.println("Year/Model = " + yr_model);
            System.out.println("Mileage = " + mileage);
            System.out.println("Price = "+ price);
        }
}  

class Car extends Automobile{
    public Car(String m,String y_m,double mil,double p){
        super(m, y_m, mil, p);
    }
}

class Truck extends Automobile{
    public Truck(String m,String y_m,double mil,double p){
        super(m, y_m, mil, p);
    }
}

class Van extends Automobile{
    public Van(String m,String y_m,double mil,double p){
        super(m, y_m, mil, p);
    }
}

public class VehicleInheritance{
	public static void main(String[] args) {
		System.out.print("Enter Details: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] s = data.split(",");
        
        if(s.length != 4){
            System.out.println("invalid arguments");
            System.exit(0);
        }
        
        int year = 0;
        try{
            year = Integer.parseInt(s[1].substring(0, 4));
        }catch(NumberFormatException e){
            System.out.println("Invalid Input parameter for Year/Model");
            System.exit(1);
        }
        
        if(!(year >= 2000 && year <= 2030)){
            System.out.println("Invalid Input parameter for Year/Model");
            //System.out.println(year);
            System.exit(0);
        }
        
        Car c = new Car(s[0], s[1], Double.parseDouble(s[2]), Double.parseDouble(s[3]));
        c.display();
	}
}