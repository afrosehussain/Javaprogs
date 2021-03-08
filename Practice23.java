//A java program to check the max numberin the given file
/**********************************************
*Lab session number      : 09
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 27-01-2021
*Program name            : Practice23.java
*Topics                  : Fundamentals of files, Fundamentals of streams
                            Types of streams(byte and character)
                            IO stream classes hierarchy, handling files
************************************************/
//import the required packages
import java.lang.*;
import java.util.*;
import java.io.*;
public class Practice23{
    public static void main(String...args) throws Exception{
        try{
            File f = new File("Scores.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            int max;
            String line = br.readLine();
            max = Integer.parseInt(line);
            while(line!=null){
                int next = Integer.parseInt(line);
                if(max<next){
                    max=next;
                }
                line = br.readLine();
            }
            br.close();
            System.out.println("Maximum score: "+max);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}