//a Java program to create and access a package
/**********************************************
*Lab session number      : 07
*Type of lab             : In Lab
*Problem No.             : 02
*Programmer              : Afrose Hussain
*Date                    : 31/01/2021
*Program name            : Triangle.java
*Topics                  : Creating a package, accessing a package, adding classes to a package,                                  benefits of package, types of package, setting classpath
************************************************/

//Creating a package
package Shape;

//Accessing a class inside a package
import java.util.Scanner;

public class Triangle{
    int height, width;
    public void area(int height, int width){
        this.height=height;
        this.width=width;
        System.out.println("Area of triangle: "+(height*width/2));
    }
}
