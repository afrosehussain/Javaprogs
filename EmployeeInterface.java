//a java program to implement interfaces
/**********************************************
*Lab session number      : 06
*Type of lab             : In Lab
*Problem No.             : 03
*Programmer              : Afrose Hussain
*Date                    : 03/02/2021
*Program name            : EmployeeInterface.java
*Topics                  : Implementation of Interfaces, interface, implements, defining an interface
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

interface EmployeeDetails{
    void enterDetails(String name, int id, double salary);
    void displayData();
    void exit();
}

class UserSelection implements EmployeeDetails{
    String name;
    int id;
    double salary;
    public void enterDetails(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void displayData(){
        
        System.out.println("Employee Name = " + name);
        System.out.println("Employee Id = " + id);
        System.out.println("Employee Salary = " + salary);
    }
    
    public void exit(){
        System.exit(1);
    }
}

public class EmployeeInterface{
    public static void main(String[] args){
        System.out.print("Enter Details: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] s = data.split(",");
        if (s.length != 3){
            System.out.println("Invalid number of arguments");
        }else{
            UserSelection u = new UserSelection();
            u.enterDetails(s[0], Integer.parseInt(s[1]), Double.parseDouble(s[2]));
            u.displayData();
            u.exit();
        }
    }
}