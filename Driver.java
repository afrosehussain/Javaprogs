/**********************************************
*Case Study     : 4
*Programmer     : Afrose
*date           : 14/10/2020
*Program name   : Celebrity.java
*Topics         : Using different data types in a single program
************************************************/
//import required packages
import java.lang.*;
 
//Main method class definition
public class Driver{
     public static void main(String args[]){
         Celebrity c1 = new Celebrity();
         c1.name="Mr. Unknown";
         c1.age=42;
         c1.gender='M';
         c1.debut=2001;
         c1.latest_movie_rating=8.6f;
         c1.screentime=20134;
         c1.married=true;
         c1.networth=10.32654;
         c1.display();
        // System.out.println()
         
     }
}

class Celebrity{
   
        String name;
        char gender;
        byte age;
        short debut;
        float latest_movie_rating;
        int screentime;
        boolean married;
        double networth;
        static String nationality;
        
        
        void display(){
            System.out.println("Celebrity Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Gender: "+gender);
            System.out.println("Debut year: "+debut);
            System.out.println("Latest Movie rating: "+latest_movie_rating);
            System.out.println("Total screentime in minutes: "+screentime);
            System.out.println("Total networth in million dollors: "+networth);
            System.out.println("Married: "+married);
        }
        
    }