//a Java program to implement method overloading and method overriding
/**********************************************
*Lab session number      : 08
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 27/01/2021
*Program name            : Practice20.java
*Topics                  : Method overloading, Method Overriding, late/Dynamic/Run-time binding,  
                           Early/Static/Compile-time binding, Polymorphism
************************************************/

//imporing packages
import java.lang.*;
import java.util.*;

class Book{
    //Book properties
    String data;
    String bookname;
    String authorname;
    
    //No-argument constructor
    public Book(){
        data="Unknown";
        bookname="Unknown";
        authorname="Unknown";
    }
    
    //setData to setup desired values
    public void setData(String data){
        this.data=data;
        String temp[]=data.split(",");
        for(int i=0;i<temp.length-1;i++){
            bookname=temp[i];
            authorname=temp[i+1];
        }
    }
    
    public void display(){
        System.out.println("Book name: "+bookname);
        System.out.println("Author name: "+authorname);
    }
}

class McGrawHill extends Book{
    double price;
    public McGrawHill(){
        super();
        price=0.0;
    }
    
    public void setData(String data, double price){
        super.setData(data);
        this.price=price;
    }
    
    public void display(){
        super.display();
        System.out.println("McGrawHill Price: "+price);
    }
}

class Oxford extends Book{
    double price;
    public Oxford(){
        super();
        price=0.0;
    }
    
    public void setData(String data, double price){
        super.setData(data);
        this.price=price;
    }
    
    public void display(){
        System.out.println("Oxford Price: "+price);
    }
}

public class Practice20{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book & Authorname");
        String data = sc.nextLine();
        McGrawHill m1 =  new McGrawHill();
        Oxford o1 = new Oxford();
        m1.setData(data, 300);
        o1.setData(data, 400);
        m1.display();
        o1.display();
    }
}