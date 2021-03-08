//Implement handling exceptions to a given application
/**********************************************
*Lab session number      : 10
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 04-02-2021
*Program name            : SlopeFinder.java
*Topics                  : exception fundamentals, exception keywords, types of exceptions, 
                           exception hierarchy, custom exceptions
                           try, catch, finally, throw, throws
************************************************/
//import the required packages
import java.lang.*;
import java.util.*;

class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public int slope(int a,int b){
        int result=0;
        try{
            result=b/a;
        }
        catch(ArithmeticException e){
            System.out.println("The slope is infinity");
            System.exit(1);
        }
        return result;
    }
}

public class SlopeFinder{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the points: ");
        String data = sc.nextLine();
        String[] d = data.split(" ");
        int[] A =  Arrays.stream(d).mapToInt(Integer::parseInt).toArray();
        Point p = new Point(A[2]-A[0],A[3]-A[1]);
        double output = p.slope(p.x,p.y);
        System.out.println("The slope is "+output);
    }
}