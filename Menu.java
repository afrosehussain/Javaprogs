//a Java program to create and access a package
/**********************************************
*Lab session number      : 07
*Type of lab             : Post Lab
*Problem No.             : 02
*Programmer              : Afrose Hussain
*Date                    : 31/01/2021
*Program name            : Menu.java
*Topics                  : Creating a package, accessing a package, adding classes to a package,                                  benefits of package, types of package, setting classpath
************************************************/

//Creating a package
package Restaurant;

public class Menu{
    public void getMenu(){
        System.out.println("\n\t\tMENU");
        System.out.println("\n1. Chicken Biryani\tRs.340");
        System.out.println("\n2. Veg Biryani\t\tRs.240");
        System.out.println("\n3. Fried Rice\t\tRs.100");
        System.out.println("\n4. Meals\t\tRs.140");
    }
}