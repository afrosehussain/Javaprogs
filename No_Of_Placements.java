//a Java program to create and access a package
/**********************************************
*Lab session number      : 07
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 20/01/2021
*Program name            : No_Of_Placements.java
*Topics                  : Creating a package, accessing a package, adding classes to a package,                                benefits of package, types of package, setting classpath
************************************************/

//Creating a package
package Placements;

//Accessing a class inside a package
import java.util.Scanner;

public class No_Of_Placements{
    public String yearPlacements;
    public int year;
    public int placements;
    
    public void readData(){
        try{
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter year and placements: ");
            yearPlacements = sc.nextLine();

            String temp1 = yearPlacements.substring(0,4);
            year = Integer.parseInt(temp1);

            String temp2 = yearPlacements.substring(5);
            placements = Integer.parseInt(temp2);
        }
        catch(Exception e){
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}