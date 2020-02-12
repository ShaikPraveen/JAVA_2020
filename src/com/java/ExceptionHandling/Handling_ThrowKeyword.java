package com.java.ExceptionHandling;

public class Handling_ThrowKeyword
{
	public void getData(int a)
	{
		if (a<10) 
		{
		   throw (new ArithmeticException());	
			
		}	
	}
	  
	
	public static void main(String[] args) {
		Handling_ThrowKeyword ht=new Handling_ThrowKeyword();
		ht.getData(1);
	}
}
