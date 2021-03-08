//a java program to create and print array of student objects 
/******
*Lab session number      : 05
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 31/01/2021
*Program name            : ArrayStudents.java
*Topics                  : Variables, Data types, Conrol statements, operators
                            Classes, Objects, constructors, inheritance & its types
                            this and super keyword
                            Method Overriding
******/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class Student{
    String name;
    String address;
    int age;
    
    public Student(){
        name = "unknown";
        age = 0;
        address = "Not Available";
    }
    
    public void setInfo(String name,int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void setInfo(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        
    }
}

public class ArrayStudents{
    public static boolean onlyDigits(String s){
        return (s.matches("[0-9]+"));
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Student Details:");
	    String data = sc.nextLine();
	    
		Student[] s = new Student[3];
		String[] details = data.split(",");
		
		if (details.length > 9){
		    System.out.println("Array index Out of Bound Exception");
		    System.exit(1);
		}
		else if (details.length == 9){
		    int j = 0;
		    for(int i=0;i<3;i++){
                s[i]=new Student();
                s[i].setInfo(details[j], Integer.parseInt(details[j + 1]), details[j + 2]);
                j=j+3;
                s[i].display();
            }
		}else{
		    if(details.length < 6){
		        System.out.println("Array index Out of Bound Exception");
		        System.exit(1);
		    }
		    
		    int[] check = {0, 0, 0};
		    if(onlyDigits(details[3])){
		        check[0] = 1;
		    }
		    
		    if(onlyDigits(details[details.length - 1])){
		        check[2] = 1;
		    }
		    
            
		    if((check[0] == 1 && onlyDigits(details[5])) || (check[0] == 0 && onlyDigits(details[6]))){
		        check[1] = 1;
		    } 
		    
		    int j = 0;
		    for(int i=0; i < 3; i++){
                s[i]=new Student();
                if (check[i] == 1){
                    s[i].setInfo(details[j], Integer.parseInt(details[j + 1]));
                j=j+2;
                s[i].display();
                continue;
                }
                s[i].setInfo(details[j], Integer.parseInt(details[j + 1]), details[j + 2]);
                j=j+3;
                s[i].display();
		    }
		}
		
	}
}