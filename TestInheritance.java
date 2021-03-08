/*A An automobile base class with cars, trucks as child classes, complete with parameters constructors which pass the parents member variables to the child class*/
/**********************************************
*Lab session number      : 05
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 23/12/2020
*Program name            : TestInheritance.java
*Topics                  : Variables, Data types, Conrol statements, operators
                            Classes, Objects, constructors, inheritance & its types
                            this and super keyword
                            Method Overriding
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class Automobile{
    //Add variables
    String make;
    String yearModel;
    
    //Add no argument constructor
    public Automobile(){
        make = "Unknown";
        yearModel = "Unknown";
    }
    
    //Add parameterised constructor
    public Automobile(String make, String yearModel){
        this.make = make;
        this.yearModel = yearModel;
    }
    
    public void display(){
        System.out.println("\n\nMake: " + make);
        System.out.println("Year Model: " + yearModel);
    }
}

class Vehicle extends Automobile{
    //Add variables
    String plateNumber;
    int numOfWheels;
    int fuel;
    int speed;
    static int maxspeed=100;
    
    //Add no argument constructor
    public Vehicle(){
        plateNumber = "unknown";
        numOfWheels = 0;
        fuel = 0;
        speed = 0;
    }
    
    //Add parameterised Constructor
    public Vehicle(String make, String yearModel, String plateNumber, int numOfWheels, int fuel, int speed){
        super.make = make;
        super.yearModel = yearModel;
        this.plateNumber = plateNumber;
        this.numOfWheels = numOfWheels;
        this.fuel = fuel;
        this.speed = speed;
    }
    
    //Display the details of vehicle
    public void display(){
        super.display();
        System.out.println("Plate Number: "+plateNumber);
        System.out.println("Number of wheels: "+numOfWheels);
        System.out.println("Fuel: "+fuel+" in litres");
        System.out.println("Speed: "+speed);
    }
}

class Car extends Vehicle{
    double price;
    double totalPrice;
    
    //Adding no argument constructor
    public Car(){
        super();
        price=0.0;
        totalPrice=0.0;
    }
    
    //Adding parameterised constructor
    public Car(String make, String yearModel, String plateNumber, int numOfWheels, int fuel, int speed, double price){
        super(make, yearModel, plateNumber, numOfWheels, fuel, speed);
        this.price = price;
    }
    
    //Adding method to compute total price
    public void compute(){
        String year = yearModel.substring(0,4);
        int y =  Integer.parseInt(year);
        if(y>=2000 && y<=2010){
            totalPrice = price-(price*0.15);
        } else if(y>=2011 && y<=2018){
            totalPrice = price-(price*0.07);
        } else if(y==2019 || y==2020){
            totalPrice = price;
        }else{
            System.out.println("Invalid Model");
        }
        
    }
    
    //display car details
    public void display(){
        super.display();
        System.out.println("Actual Price: "+price);
        System.out.println("Invoice Price: "+totalPrice);
        
    }
}

class Bike extends Vehicle{
    double distance;
    double mileage;
    
    //Adding no argument constructor
    public Bike(){
        super();
        distance=0;
    }
    
    //Adding parameterised constructor
    public Bike(String make, String yearModel, String plateNumber, int numOfWheels, int fuel, int speed, double distance){
        super(make, yearModel, plateNumber, numOfWheels, fuel, speed);
        this.distance = distance;
    }
    
    //Adding mileage function;
    public void computeMileage(){
        mileage = distance/fuel;
    }
    
    //display bike details
    public void display(){
        super.display();
        System.out.println("Distance travelled: "+distance+" in Kms");
        System.out.println("Mileage of bike: "+mileage+" in KmpL");
    }
}

public class TestInheritance{
    public  static void main(String...args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the type of Automobile(1 for Bike/2 for Car): ");
        int type = sc.nextInt();
        
        if(type==1){
            System.out.print("Name of the Bike: ");
            String make = sc.nextLine();

            System.out.print("Year and Model of Bike: ");
            String yearModel = sc.nextLine();

            System.out.print("Plate Number of Bike: ");
            String plateNumber = sc.nextLine();

            System.out.print("Enter number of wheels: ");
            int numOfWheels = sc.nextInt();

            System.out.print("Enter Fuel: ");
            int fuel = sc.nextInt();

            System.out.print("Enter speed: ");
            int speed = sc.nextInt();

            System.out.print("Enter distance travelled on bike: ");
            double distance = sc.nextInt();


            Bike b1 = new Bike(make, yearModel, plateNumber, numOfWheels, fuel, speed, distance);
            b1.computeMileage();
            b1.display();
            
        } else if(type==2){
            System.out.println("Name of the Car: ");
            String make = sc.nextLine();

            System.out.print("Year and Model of Car: ");
            String yearModel = sc.nextLine();

            System.out.print("Plate Number of Car: ");
            String plateNumber = sc.nextLine();

            System.out.print("Enter number of wheels: ");
            int numOfWheels = sc.nextInt();

            System.out.print("Enter Fuel: ");
            int fuel = sc.nextInt();

            System.out.print("Enter speed: ");
            int speed = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            Car c1= new Car(make, yearModel, plateNumber, numOfWheels, fuel, speed, price);
            c1.compute();
            c1.display();
        } else{
            System.out.println("Invalid Automobile");
        }
        
        
    }
}
