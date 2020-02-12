package com.java.ConditionalStatements;

public class Handling_ConditionalStatements 
{
	
	//1. EXAMPLE
	//WAP TO CHECK THE GIVEN NUMBER IS EVEN NUMBER OR ODD NUMBER
	public void checkEvenOrOdd(int inputnum)
	{
		if (inputnum%2==0) 
		{
		    System.out.println("GIVEN NUMBER IS EVEN NUMBER");	
		} else {
			System.out.println("GIVEN NUMBER IS ODD NUMBER");
		}	
	}
	
	
	
	//2.EXAMPLE
	public void checkNumber(int inputNumber)
	{
		if(inputNumber < 0)
		{ 
			System.out.println("GIVEN NUMBER IS -NEGATIVE NUMBER");
			
		}else if(inputNumber == 0)
		{
			System.out.println("GIVEN NUMBER IS ZERO");
		}else if(inputNumber %2==0)
		{
			System.out.println("GIVEN NUMBER IS EVEN NUMBER");
		}else
		{
			System.out.println("GIVEN NUMBER IS ODD NUMBER");
		}
	}
	
	
	//3.EXAMPLE	
	public void checkGivenNumber(int inputnumner) 
	{
		if (inputnumner >=0 && inputnumner <=100) //Both the Conditions are true
		{
		    System.out.println("GIVEN NUMBER IS SMALL NUMBER");	
		} else 
		{
			 System.out.println("GIVEN NUMBER IS BIG NUMBER");
		}
	}
	
	//4.EXAMPLE
	public void checkgivenNumber(int inputnumner) 
	{
		if (inputnumner <0 || inputnumner > 100) 
		{
		    System.out.println("GIVEN NUMBER IS INVALID NUMBER");	
		} else 
		{
			 System.out.println("GIVEN NUMBER IS VALID NUMBER");
		}
	}
	
	public static void main(String[] args) {
		Handling_ConditionalStatements eo=new Handling_ConditionalStatements();
		//eo.checkEvenOrOdd(11);
		
		//eo.checkNumber(0);
		
		//eo.checkGivenNumber(100);
		
		eo.checkgivenNumber(11);
	}

}
