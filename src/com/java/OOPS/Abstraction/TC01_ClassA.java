package com.java.OOPS.Abstraction;

public abstract class TC01_ClassA
{
	//Requirements i have 3 methds
	// First Method Sum with 2 arguments
	// First Method Sub with 2 arguments
	// First Method Mul with 2 arguments
	
	
	  //Concrete Method
	  public void sum(int a, int b)
	  {
		  System.out.println(a+b);
	  }

	    public abstract void sub(int a, int b);
	    public abstract void mul(int a, int b);

}
