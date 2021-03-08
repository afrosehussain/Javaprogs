// A java program to left shift an array
/**********************************************
*Lab session number      : 03
*Type of lab             : In Lab
*Problem No.             : 03
*Programmer              : Afrose Hussain
*Date                    : 07/02/2021
*Program name            : ArrayRotation.java
*Topics                  : creating arrays, accessing elements in arrays
************************************************/

//import the required packages
import java.lang.*;
import java.util.*;


class LeftShift{
    public static void leftShift(int[] A, int shiftBy){
        int[] temp = new int[shiftBy];
        //elements to be added at last are stored in a temporary array
        for(int i = 0; i < shiftBy; i++){
            temp[i] = A[i];
        }
        
        //shifting elements after given number to front
        int len = A.length;
        int j = 0;
        for(int i = shiftBy; i < len; i++){
            A[j] = A[i];
            j++;
        }
        
        //adding elements at end
        int k = 0;
        for(int i = j; i < len; i++){
            A[i] = temp[k];
            k++;
        }        
    } 
    
    public static void display(int[] A){
        System.out.print("Rotated Array: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}



public class ArrayRotation{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

		System.out.print("Enter elements of array: ");
		String data = sc.nextLine();
		
		System.out.print("Enter number of elements to rotate: ");
		int shiftBy = sc.nextInt();
		
		String[] d = data.split(" ");
		int[] A =  Arrays.stream(d).mapToInt(Integer::parseInt).toArray();
		
		LeftShift.leftShift(A, shiftBy);
		LeftShift.display(A);
	}
}