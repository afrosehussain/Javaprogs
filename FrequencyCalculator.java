// A java program to count the frequency of elements in the given array
/**********************************************
*Lab session number      : 03
*Type of lab             : In Lab
*Problem No.             : 02
*Programmer              : Afrose Hussain
*Date                    : 09/02/2021
*Program name            : FrequencyCalculator.java
*Topics                  : creating arrays, accessing elements in arrays
************************************************/

//import the required packages
import java.lang.*;
import java.util.*;

class Frequency{
    public static int[][] freq(int[] A){
        int[][] freq = new int[A.length][2];
        int k = 0;
        
        for(int i = 0; i < A.length; i++){
            if(A[i] == Integer.MIN_VALUE){
                continue;
            }
            freq[k][0] = A[i];
            freq[k][1] = 1;
            for(int j = i + 1; j < A.length; j++){
                if(A[i] == A[j]){
                    A[j] =  Integer.MIN_VALUE;
                    freq[k][0] = A[i];
                    freq[k][1] += 1;
                }
            }
            k++;
        }
        return Arrays.copyOfRange(freq, 0, k);
        
    }
    
    public static void display(int[][] A){
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i][0] + " Frequency is " + A[i][1]);
        }
    }

}



public class FrequencyCalculator{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

  System.out.print("Enter elements of array: ");
  String data = sc.nextLine();
  
  String[] d = data.split(" ");
  int[] A =  Arrays.stream(d).mapToInt(Integer::parseInt).toArray();
  
  int[][] freq = Frequency.freq(A);
  Frequency.display(freq);
  
  
 }
}