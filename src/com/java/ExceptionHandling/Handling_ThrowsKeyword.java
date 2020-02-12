package com.java.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Handling_ThrowsKeyword 
{
	public void getData() throws FileNotFoundException,ArithmeticException,NullPointerException
	{
		File f=new File("d:\\sample.txt");
		FileReader fr=new FileReader(f);
	}

}
