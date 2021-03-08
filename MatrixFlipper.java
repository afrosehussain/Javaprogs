//A java program to flip the elements of a multidimensional collection
/**********************************************
*Lab session number      : 12
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 17-02-2021
*Program name            : FlipTest.java
*Topics                  : Fundamentals of Collectons, Collections Framework Hierarchy,it's methods
************************************************/
//import the required packages
import java.lang.*;
import java.util.*;

class FlipTest{
    public  ArrayList<ArrayList <Integer>> flip(ArrayList<ArrayList <Integer>> A, Character dim){
      
      if(dim == 'h'){
        for(int i = 0; i < A.size(); i++){
          Collections.reverse(A.get(i));
        }
      }
      
      if(dim == 'v'){
      	Collections.reverse(A);
    }
    
      return A;
      
}
}

public class MatrixFlipper{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer> > matrix = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer> > temp  = new ArrayList<ArrayList<Integer>>();
        
    
    
      
    System.out.print("Enter rows: ");
    int row = sc.nextInt();
    System.out.print("Enter cols: ");
    int col = sc.nextInt();
    System.out.print("Enter h or v: ");
    char dim = sc.next().charAt(0);
    for(int i = 0; i < row  ;i++){
        ArrayList<Integer> temp_row = new ArrayList<Integer>();
        for(int j = 0 ; j < col ; j++){
            System.out.println("Enter element: ");
            int x = sc.nextInt();
            temp_row.add(x);
        }
        matrix.add(temp_row);
    }/*
    ArrayList<Integer> row1 = new ArrayList<Integer>();
    row1.add(1);
    row1.add(2);
    row1.add(3);
    ArrayList<Integer> row2 = new ArrayList<Integer>();
    row2.add(4);
    row2.add(5);
    row2.add(6);
    //addd to matrix
    matrix.add(row1); 
    matrix.add(row2);*/
    
  
    
    for(ArrayList<Integer> i: matrix){
        temp.add(i);
    }
    //System.out.println();
    FlipTest f = new FlipTest();
    f.flip(temp, dim);
    System.out.println(matrix);
    System.out.println(temp);
    }
}