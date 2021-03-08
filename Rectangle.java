//Creating a package
package Shape;


public class Rectangle{
    int height, width;
    public void area(int height, int width){
        this.height=height;
        this.width=width;
       System.out.println("Area of rectangle: "+(height*width));
    }
}
