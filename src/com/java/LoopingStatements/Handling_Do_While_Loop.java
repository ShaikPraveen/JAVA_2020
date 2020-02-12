package com.java.LoopingStatements;

public class Handling_Do_While_Loop
{
	//1.Print 1 to 10
		public void print()
		{
			int i=1;
			do
			{
				System.out.println(i);
				i++;
			}while(i<=10);
		}
		
		//2.Print 10 to 1
			public void printReverse()
			{
				int i=10;
				do
				{
					System.out.println(i);
					i--;
				}while(i>=1);
			}
			
			
	   //3. Print Table
		public void printTable(int inputNumber)
		{
			int i=1;
			do
			{
				System.out.println(inputNumber+" * "+ i+" = "+i*inputNumber);
				i++;
			}while(i<=10);	
		}
		
		
		//4.Print Print Table
		public void printRevTable(int inputNumber)
		{
			int i=10;
			do
			{
				System.out.println(inputNumber+" * "+ i+" = "+   i*inputNumber);
				i--;
			}while(i>=1);
		}
		
		
		public static void main(String[] args) {
			Handling_Do_While_Loop dwl=new Handling_Do_While_Loop();
			dwl.print();
			System.out.println("************");
			dwl.printReverse();
			System.out.println("************");
			dwl.printTable(5);
			System.out.println("************");
			dwl.printRevTable(10);
			
		}

}
