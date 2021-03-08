//A java application toimplement Collections Framework
/**********************************************
*Lab session number      : 12
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 16-02-2021
*Program name            : CheckIMEI.java
*Topics                  : Fundamentals of Collectons, Collections Framework Hierarchy,it's methods
************************************************/
//import the required packages
import java.lang.*;
import java.util.*;

public class CheckIMEI{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int size = 15,sum=0;
        int x=0;
        System.out.print("Enter 15 digit IMEI code: ");
        String data=sc.nextLine();
        //Creaing ArrayList Collection
        ArrayList<Integer> imei=new ArrayList<Integer>(size);
        //Append the elements at the end of the list
        for(int i=0;i<data.length();i++){
            x=data.charAt(i)-'0';
            imei.add(x);
        }
        
        Integer[] temp = new Integer[imei.size()];
        for(int j=0;j<temp.length;j++){
            temp[j]=imei.get(j);
        }
        
        if(temp.length!=15){
            System.out.println("Invalid Input");
        } else{
            int d=0;
            for(int i=size-1;i>=0;i--){
                d=temp[i];
                if(i%2==1){
                    d=2*d;
                }
                sum=sum+sumDig(d);
            }
        }
        System.out.println("\nOutput Sum: "+sum);
        if(sum%10==0){
            System.out.println("\nValid IMEI number");
        } else{
            System.out.println("\nInvalid IMEI number");
        }
    }
    public static int sumDig(int n){
        int a=0;
        while(n>0){
            a=a+(n%10);
            n=n/10;
        }
        return a;
    }
}