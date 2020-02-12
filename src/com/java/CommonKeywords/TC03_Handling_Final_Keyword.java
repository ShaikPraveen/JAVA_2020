package com.java.CommonKeywords;

public  class TC03_Handling_Final_Keyword 
{
	final int i=10;
	
	public void changeValue()
	{
		//i=20;  //shows an error, we can not  change the value
	}
	
	
	public final void hello()
	{
		System.out.println("this is parent class method");
	}

}
