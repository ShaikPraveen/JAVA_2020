package com.java.InterviewPrograms.Advanced_Java_Programs;

import java.util.Scanner;

public class PROGRAM_2 
{
	//WAP TO PRINT FLOYDS TRIANGLE
	
 /*                     1
	                    2 3
	                    4 5 6
	                    7 8 9 10
	                    
	  KEY POINTS :- 1. Number is keep on Incrementing
	                2. Two For Loops
	                       
	                    
*/	
	public static void main(String[] args) 
	{
		int n,c,d,num=1;
		
		//Here n is for Number of rows , take the input from the console
		//Here c is for Each Row
		//Here d is for whole the value of each element in the row
		
		System.out.println("NUMBER OF ROWS");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(c=1; c<=n ;c++)
		{
			 for(d=1;d<=c;d++)
			 {
				 System.out.print(num+" ");
				 num++;
			 }
			System.out.println();
		}
	}	
}
