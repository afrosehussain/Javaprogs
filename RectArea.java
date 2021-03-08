/**********************************************
*Case Study     : 5
*Programmer     : Afrose
*date           : 16/10/2020
*Program name   : RectArea.java
*Topics         : To display area of rectangle
************************************************/
//import required packages
import java.lang.*;
 
//Main method class definition
public class RectArea{
    public static void main(String...args){
        Rectangle r1 = new Rectangle();
        r1.length=3;
        r1.width=2;
        r1.display();
    }
}

class Rectangle{
    byte length;
    byte width;
    
    void display(){
        System.out.println("Area of rectangle: "+ (length*width));
    }
}