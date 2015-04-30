/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is for the Hailstone problem.
 * Author:Chao Liu
 * Contact: liuchao200240@gmail.com
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		//Read in the initial number.
		int n = readInt("Enter a number: ");
		if(n == 0){
			return;
		}
		int i = 0;
		while(n != 1){	
		//If n is odd, n = 3 * n +1.
		if(n % 2 == 1){
			println(n + " is odd, so I make 3n +1: " + 3*n+1);
			n = 3 * n +1;
		
			//If n is even, n = n/2.
		}else{
			println(n + " is even, so I take half: " + n/2);
			n = n/2;
		}
		i++;
		}
		//Print the result.
		println("The process took " + i + " to reach 1");
	}
}
