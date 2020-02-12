package com.java.LoopingStatements;

public class Handling_While_Loop
{
	//1.Print 1 to 10
	public void print()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	//2.Print 10 to 1
		public void printReverse()
		{
			int i=10;
			while(i>=1)
			{
				System.out.println(i);
				i--;
			}
		}
		
		
   //3. Print Table
	public void printTable(int inputNumber)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(inputNumber+" * "+ i+" = "+i*inputNumber);
			i++;
		}	
	}
	
	
	
	//4.Print Print Table
			public void printRevTable(int inputNumber)
			{
				int i=10;
				while(i>=1)
				{
					System.out.println(inputNumber+" * "+ i+" = "+   i*inputNumber);
					i--;
				}
			}
		
	
	public static void main(String[] args) {
		Handling_While_Loop wl=new Handling_While_Loop();
		wl.print();
		System.out.println("========");
		wl.printReverse();
		System.out.println("========");
		wl.printTable(5);
		System.out.println("========");
		wl.printRevTable(6);
	}

}
