/**********************************************
*Case Study     : 6
*Programmer     : Afrose
*date           : 16/10/2020
*Program name   : RectAreaPer.java
*Topics         : To display area,perimeter of rectangle
************************************************/
//import required packages
import java.lang.*;
 
//Main method class definition
public class RectAreaPer{
    public static void main(String...args){
        Rectangle r1 = new Rectangle();
        r1.length=7;
        r1.width=5;
        r1.calculateArea();
        r1.calculatePerimeter();
        r1.display();
    }
}

class Rectangle{
    byte length;
    byte width;
    int area;
    int perimeter;
    
    void calculateArea(){
        area=length*width;
    }
    void calculatePerimeter(){
        perimeter=2*(length+width);
    }
    void display(){
        System.out.println("Area of rectangle: "+ area);
        System.out.println("Area of rectangle: "+ perimeter);
    }
}