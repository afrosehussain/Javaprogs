//a java program to implement arrays
/**********************************************
*Lab session number      : 03
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 07/02/2021
*Program name            : HistoryStudents.java
*Topics                  : creating arrays, accessing elements in arrays
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class History{
    double mean, stand;
    int a,b,c,d,e,f,g,h,i,j;
    void mean(int[] students, int n){
        for(int k=0;k<n;k++){
            mean=mean+students[k];
        }
        mean=mean/n;
    }
    
    void sd(int[] students, int n){
        for(int k=0;k<n;k++){
            stand=stand+((students[k]-mean)*(students[k]-mean));
        }
        stand=stand/n;
        stand=Math.sqrt(stand);
    }
    
    void histogram(int[] students, int n){
        for(int k=0;k<n;k++){
            if(students[k]<10){
                a++;
            } else if(students[k]<20){
                b++;
            } else if(students[k]<30){
                c++;
            } else if(students[k]<40){
                d++;
            } else if(students[k]<50){
                e++;
            } else if(students[k]<60){
                f++;
            } else if(students[k]<70){
                g++;
            } else if(students[k]<80){
                h++;
            } else if(students[k]<90){
                i++;
            } else if(students[k]<=100){
                j++;
            } else{
                System.out.println("Invalid output");
            }
        }
    }
    
    void display(){
        System.out.println("Mean: "+String.format("%.2f",mean));
        System.out.println("Standard Deviation: "+String.format("%.2f",stand));
        System.out.println("0-9:\t"+a);
        System.out.println("10-19:\t"+b);
        System.out.println("20-29:\t"+c);
        System.out.println("30-39:\t"+d);
        System.out.println("40-49:\t"+e);
        System.out.println("50-59:\t"+f);
        System.out.println("60-69:\t"+g);
        System.out.println("70-79:\t"+h);
        System.out.println("80-89:\t"+i);
        System.out.println("90-100:\t"+j);
    }
}

public class HistoryStudents{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        int[] students = new int[100];
        for(int i=0;i<num;i++){
            System.out.print("Enter "+(i+1)+"th student's marks: ");
            students[i] = sc.nextInt();
        }
        History h = new History();
        h.mean(students,num);
        h.sd(students,num);
        h.histogram(students,num);
        h.display();
    }
}