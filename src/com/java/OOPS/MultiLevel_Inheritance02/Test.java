package com.java.OOPS.MultiLevel_Inheritance02;

public class Test 
{
	public static void main(String[] args) 
	{
		ClassA a=new ClassA();
		a.aClassMethod();
		
		ClassB b=new ClassB();
		b.aClassMethod();
		b.bClassMethod();
		
		
		ClassC c=new ClassC();
		c.aClassMethod();
		c.bClassMethod();
		c.cClassMethod();	
	}
}
