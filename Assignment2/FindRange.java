/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		println("This program finds the largest and smallest numbers.");
		
		//Initialize the smallest and largest number.
		int largest = 0;
		int smallest = 0;
		
		//Read in the first number.
		int n1 = readInt("? ");
		if(n1 == 0){
			print("No number read in.");
			return;
		}else{
		 largest = n1;
		 smallest = n1;
		}
		
		//Read in the numbers and find the smallest and largest number.
		while(true){
			int n2 = readInt("? ");
			if (n2 == 0){
				break;
			}else if(n2 > largest){
				largest = n2;
			}else if(n2 < smallest){
				smallest = n2;	
			}
		}
		
		//Print the smallest and largest number.
		println("smallest: " + smallest);
		println("largest: " + largest);
	}
}

