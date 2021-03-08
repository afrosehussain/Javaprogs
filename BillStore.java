//A java program that records a purchase made at a store in a file
/**********************************************
*Lab session number      : 09
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 27-01-2021
*Program name            : BillStore.java
*Topics                  : Fundamentals of files, Fundamentals of streams
                            Types of streams(byte and character)
                            IO stream classes hierarchy, handling files
************************************************/
//import the required packages
import java.lang.*;
import java.util.*;
import java.io.*;

public class BillStore{
	public static void main(String[] args) {
	    try{
    	    Scanner sc = new Scanner(System.in);
    		File p_file = new File("Purchases.txt");
    		System.out.println("Enter file name, items name, its price and the number bought:");
    		String data = sc.nextLine();
    		String[] d = data.split(" ");
    		String file_name = d[0];
    		String item_name = d[1];
    		double price = Double.parseDouble(d[2]);
    		int quantity = Integer.parseInt(d[3]);
    		p_file.createNewFile();
    		FileWriter fr = new FileWriter(p_file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(item_name + " " + price + " " + quantity + " total price: " + price * quantity);
            System.out.println(file_name + " file created \nThe Total expenditure is Rs. " + price * quantity);
    
            br.close();
            fr.close();
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}
}