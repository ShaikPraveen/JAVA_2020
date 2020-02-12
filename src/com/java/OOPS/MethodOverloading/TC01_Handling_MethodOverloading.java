package com.java.OOPS.MethodOverloading;

public class TC01_Handling_MethodOverloading 
{
	
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void sum(int a,float f)
	{
		System.out.println(a+f);
	}

}
