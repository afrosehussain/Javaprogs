/*A java program to test various scenarios of inheritance*/
/**********************************************
*Lab session number      : 05
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 13/01/2021
*Program name            : PracticeDegree.java
*Topics                  : Variables, Data types, Conrol statements, operators
                            Classes, Objects, constructors, inheritance & its types
                            this and super keyword
                            Method Overriding
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class Degree{
		public void getDegree(){
			System.out.println("I got a degree");
		}
}
class Undergraduate extends Degree{
		public void degreeName(){
			System.out.println("I am a Undergraduate");
		}
}
class Postgraduate extends Degree{
		public void degreeName(){
			System.out.println("I am a Postgraduate");
		}
}

public class PracticeDegree{
		public static void main(String...args){
			Degree d1=new Degree();
			Undergraduate ug=new Undergraduate();
			Postgraduate pg=new Postgraduate();
			ug.degreeName();
			pg.degreeName();
			ug.getDegree();
			d1.degreeName();// This statement throws an error
		}
}