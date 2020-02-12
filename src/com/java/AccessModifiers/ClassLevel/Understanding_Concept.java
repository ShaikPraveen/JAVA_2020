package com.java.AccessModifiers.ClassLevel;

public class Understanding_Concept 
{
	
	// We have around four access modifiers like PUBLIC, PRIVATE, DEFAULT and PROTECTED
	
	// Q: Can we use this Access Modifiers in Class Level?
	// A: NO
	
	
	//Suppose i have Public class, in that Public Class i have all Access Modifiers Methods
	//If the class is Public, i can not impact on Class Members
	//(like it is public method or default method ot private method or protected method)
	
	
	//Suppose if the Class level is default, we can access this class members in within the package only
	//But side of the package we can't access this class members after creating oject also
    //So, Finally while using  default in class level it will impact on class members also	

	
	  public static void main(String[] args) {
		TC01_AccessModifiers tc=new TC01_AccessModifiers();
		tc.hello();
	}
}
