/*a Java program to make a new string with each character of just before and after of t-string whichever it appears in m-string*/
/**********************************************
*Lab session number      : 04
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose
*Date                    : 06/01/2021
*Program name            : Practice13.java
*Topics                  : String, BufferString
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;


class PatternString{
    String m_string;
    String t_string;
    String result="";
    
    //Adding parameterised constructor
    public PatternString(String m, String t){
        m_string = m;
        t_string = t;
    }
    
    //Adding method
    public void mAndTstring(){
        int m_len = m_string.length();
        int t_len = t_string.length();
        for(int i=0;i<m_len-t_len+1;i++){
            String temp= m_string.substring(i,i+t_len);
            if(i>=0 && temp.equals(t_string)){
                result+=m_string.substring(i-1,i);
            }
            if(i<m_len-t_len && temp.equals(t_string)){
                result+=m_string.substring(i+t_len,i+t_len+1);
            }
        }
    }
    
    public void display(){
        System.out.println("The given m_string is: "+m_string);
        System.out.println("The given t_string is: "+t_string);
        System.out.println("The output string is: "+result);
    }
}

//Adding Driver class
public class Practice13{
    public static void main(String...args){
        String m_string = "weablcoabmeabandab";
        String t_string = "ab";
        PatternString ps = new PatternString(m_string,t_string);
        ps.mAndTstring();
        ps.display();
    }
}
