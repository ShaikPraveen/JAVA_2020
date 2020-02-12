package com.java.Java01_Variables;

import com.java.Java02_ClassObjects.TC01_ClassObjects;

public class TC01_MethodsTest 
{
	public void mytesting()
	{
		System.out.println("THIS IS MY TESTING CLASS METHOD");
	}
	
	public static void main(String[] args) {
		TC01_ClassObjects tc=new TC01_ClassObjects();
		tc.hello();
		tc.testing();
		
		TC01_MethodsTest tc1=new TC01_MethodsTest();
		tc1.mytesting();
		
	}

}
