package com.java.AccessModifiers.PUBLIC_02;

import com.java.AccessModifiers.PUBLIC_01.TC01_Handling_Public_AccessModifier;

public class TC01_My_Public_Methods 
{
	
	//Here i am accessing public method, 
	//here public method is availbale in another package
	//Here i am accessing only Class Members(Vaiables and Methods)
	
	public static void main(String[] args) {
		
		TC01_Handling_Public_AccessModifier pa=new TC01_Handling_Public_AccessModifier();
		pa.hello();
		
	}

}
