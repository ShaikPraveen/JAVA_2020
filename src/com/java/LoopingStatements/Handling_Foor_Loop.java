package com.java.LoopingStatements;

public class Handling_Foor_Loop 
{
	//1.WAP TO PRINT 1 TO 10
	public void printNumbers()
	{
		for (int i = 1; i<=10; i++) 
		{
		System.out.println(i);	
		}
	}
	
	//2.WAP TO PRINT 10 TO 1
		public void printNumberss()
		{
			for (int i = 10; i>=1; i--) 
			{
			System.out.println(i);	
			}
		}
		
		
    //3.Print Table with Correct Format
		public void printTable(int inputNumber)
		{
			for(int i=1; i<=10;i++)
			{
				System.out.println(inputNumber +" * " + i +" = "+i*inputNumber); // 5 * 1 = 5
			}
		}
		
	//4.Print Table with Correct Format
		public void revTable(int inputNumber)
		{
			for(int i=10; i>=1;i--)
				{
				System.out.println(inputNumber +" * " + i +" = "+i*inputNumber); // 5 * 1 = 5
			}
			}
		
	public static void main(String[] args) {
		Handling_Foor_Loop fp=new Handling_Foor_Loop();
		//fp.printNumbers();
		//fp.printNumberss();
		
		//fp.printTable(65);
		  fp.revTable(5);
	}
}
