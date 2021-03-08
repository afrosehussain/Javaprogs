//A java program that demonstrates the use of constructors, classes and objects with an employee example
/**********************************************
*Lab session number      : 02
*Type of lab             : Post Lab
*Problem No.             : 02
*Programmer              : Afrose
*Date                    : 09/11/2020
*Program name            : EmployeeTest.java
*Topics                  : Implementation of classes and objects
************************************************/

//import required packages
import java.lang.*;
import java.util.*;

class Employee{
    String firstName;
    String lastName;
    double monthlySalary;
    Scanner console = new Scanner(System.in);
    
    Employee(){
        firstName = null;
        lastName = null;
        monthlySalary = 0.0;
    }
    
    void get(){
        System.out.print("\nEnter First Name: ");
        firstName = console.next();
        System.out.print("Enter Last Name: ");
        lastName = console.next();
        System.out.print("Enter salary: ");
        monthlySalary = console.nextDouble();
    }
    
    void set(){
        if(monthlySalary<0){
            monthlySalary=0;
        }
    }
    
    double raisedSalary(){
        double raisedSalary=monthlySalary*12;
        double increment=raisedSalary*0.1;
        raisedSalary=raisedSalary+increment;
        return raisedSalary;
    }
    void display(){
        System.out.println("\nEmployee name: "+firstName+" "+lastName);
        System.out.println("Yearly salary: "+monthlySalary*12);
        System.out.println("Yearly salary after 10% raise: "+raisedSalary());
    }
}

public class EmployeeTest{
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.get();
        e1.set();
        e2.get();
        e2.set();
        e1.display();
        e2.display();
    }
}