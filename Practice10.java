/**********************************************
*Lab session number      : 02
*Type of lab             : In Lab
*Problem No.             : 03
*Programmer              : Afrose
*Date                    : 03/11/2020
*Program name            : Practice10.java
*Topics                  : Implementation of classes and objects
************************************************/

//import required packages
import java.lang.*;
import java.util.*;

class Employee{
    String ename;
    int eid;
    
    //no argument constructor
    Employee(){
        System.out.println("Iam in no arguments constructor");
    }
    
    //parameterised constructor
    Employee(String name){
        this();
        ename = name;
    }
    
    Employee(String name, int id){
        this(name);
        eid = id;
    }
    
    void display(){
        System.out.println("Employee Name: "+ename);
        System.out.println("Employee ID: "+eid);
    }
}

class Practice10{
    public static void main(String...args){
        Employee e1 = new Employee("Afrose",38);
        Employee e2 = new Employee("Hussain",50);
        e1.display();
        e2.display();
    }
}