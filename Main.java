// A java program to left shift an array
import java.util.*; 

//import java.util.Arrays;


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
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i] + "\t");
        }
    }
}



public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

		int[] A;
		System.out.println("Enter number of elements to rotate: ");
		int shiftBy = sc.nextInt();
		System.out.println("Enter elements of array:");
		String data = sc.nextLine();
		System.out.println(data);
		String[] d = data.split(" ");
		//A =  Arrays.stream(d).mapToInt(Integer::parseInt).toArray();
		//LeftShift.leftShift(A, shiftBy);
		//LeftShift.display(A);
	}
}