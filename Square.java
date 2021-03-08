package Shape;


public class Square{
    int height, width;
    public void area(int height, int width){
        this.height=height;
        this.width=width;
        if(height==width){
            System.out.println("Area of square: "+(height*width));
        } else{
            System.out.println("Area of square:  invalid dimensions");
        }
    }
}