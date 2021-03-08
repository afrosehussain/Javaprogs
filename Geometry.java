//Accessing created package
import Shape.Triangle;
import Shape.Rectangle;
import Shape.Square;
import java.util.*;

public class Geometry{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Triangle t1 = new Triangle();
        t1.area(x,y);
        Rectangle r1 = new Rectangle();
        r1.area(x,y);
        Square s1 = new Square();
        s1.area(x,y);
    }
}