// A java program to find maximum element in array using recursion
/**********************************************
*Lab session number      : 03
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 09/02/2021
*Program name            : RecursiveMax.java
*Topics                  : creating arrays, accessing elements in arrays
************************************************/
//import the required packages
import java.lang.*;
import java.util.*;

class ArrayFunc{
    int maxInRange(int A[],int low,int high){
        if(low==high){
            return A[low];
        }
        int mid = (low+high)/2;
        int a = maxInRange(A,low,mid);
        int b = maxInRange(A,mid+1,high);
        if(a>b){
            return a;
        } else if(a<b){
            return b;
        } else{
            return a;
        }
    }
    int max(int A[]){
        return maxInRange(A, 0, A.length - 1);
    }
}

public class RecursiveMax{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter elements of array: ");
        String data = sc.nextLine();

        String[] d = data.split(" ");
        int[] A =  Arrays.stream(d).mapToInt(Integer::parseInt).toArray();
        
        System.out.println("1 - Max In range\n2 - Max in array");
        int opt = sc.nextInt();
        
        ArrayFunc af = new ArrayFunc();
        
        if(opt == 1){

        System.out.print("Enter lower index value: ");
        int lowIndex = sc.nextInt();

        System.out.print("Enter higher index value: ");
        int highIndex = sc.nextInt();

        
        System.out.println("The Maximum element in the given range is:"+
af.maxInRange(A,lowIndex,highIndex)); 
        }
        
        if(opt == 2){
            System.out.println("The Maximum element in the given array is:" + af.max(A));
        }

        
    } 
}