package com.syntax.groupProjects;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will 
		 * calculate the sum of  even and odd numbers for that array.
		 */
		
		//1) Create a 2D array of integer values
		//2) Print the sum of all numbers
		//3) Access the elements
		//4) check the if element is even if it is add it to sumEven variable
		//5) check the if element is odd if it is add it to oddEven variable
		//6) print the values of both variables
		
		int [][] array2D= {
				{2,3,4},
				{5,6},
				{12,6,8} };
		
		int sumEven=0;
		int sumOdd=0;
		for (int x = 0; x < array2D.length; x++) {          //for (int[] row : array2D) {
			
			for(int y=0; y< array2D[x].length; y++) {		//for (int element : row) {
															//if (element % 2 == 0) {
				  int element=array2D[x][y];				//	sumEven += element;
				  											//	} else {
				  if(element%2==0) {						//sumOdd += element;
					  sumEven+=element;
				  }else {
					  sumOdd+=element;
				  }											
				  
			}
		}
			System.out.println("Sum of Even numbers "+sumEven);
			System.out.println("Sum of Odd numbers "+sumOdd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
