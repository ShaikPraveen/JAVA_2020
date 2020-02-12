package com.java.Handling.Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Handling_SimpleDateFormat 
{
	//Date Formatting using SimpleDateFormat in Java
	public static void main(String[] args)
	{
		Date date = new Date( );
        SimpleDateFormat sf= new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println("Current Date: " + sf.format(date));
		
	}

}
