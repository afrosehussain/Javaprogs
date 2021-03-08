//A java program that counts the number of poor families from a given array of Families
/******
*Lab session number      : 02
*Type of lab             : Post Lab
*Problem No.             : 01
*Programmer            	 : Afrose Hussain
*Date                    : 09/11/2020
*Program name            : Practice1.java
*Topics                  : Implementation of classes and objects
******/
//import required packages

import java.lang.*;
import java.util.*;


class Family{
	double income;
	int size;
	double housingCost;
	double foodCost;

	public Family(double income, int size){
		this.income = income;
		this.size = size;
	}

	public void getCosts(double housingCost, double foodCost){
		this.housingCost = housingCost;
		this.foodCost = foodCost;
	}

	public boolean isPoor(){
		
		return (housingCost + (foodCost * size) > (income / 2));
	}

	public String toString(){
		return ("income : " + income + "\nsize: " + size + "\nHousing Cost:"
			+ housingCost + "\nFood Cost: " + foodCost);
	}
}

class CountPoor{
	public static int count(Family[] families){
		int poorFamilies = 0;
		for (int i = 0; i < families.length; i++){
			if(families[i].isPoor()){
				poorFamilies++;
			}
		}
		return poorFamilies;
	}
}

public class Practice1{
	public static void main(String...args){
		int numOfFamilies;
		double income, housingCost, foodCost;
		int size;
		System.out.print("Enter number of families: ");
		Scanner console = new Scanner(System.in);
		numOfFamilies = console.nextInt();

		//creating array of objects
		Family[] families = new Family[numOfFamilies];

		for(int i = 0; i < numOfFamilies; i++){
			System.out.print("Enter income: ");
			income = console.nextDouble();
		
			System.out.print("Enter num of members in family: ");
			size = console.nextInt();

			families[i] = new Family(income, size);

			System.out.print("Enter Housing Cost: ");
			housingCost = console.nextDouble();

			System.out.print("Enter avg food cost per person: ");
			foodCost = console.nextDouble();

			families[i].getCosts(housingCost, foodCost);
		}

		System.out.println("Poor families count is: " + CountPoor.count(families));
	}
}