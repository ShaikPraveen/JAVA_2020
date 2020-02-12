package com.java.Handling.Dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Handling_Get_DateTime 
{
	//How to get current date and time in Java
	public static void main(String[] args)
	{
		 //using Date Class
	      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	      Date date = new Date();
	      System.out.println("Using Date Class " + dateFormat.format(date));
	        
	      //using Calendar Class
	      Calendar cal = Calendar.getInstance();
	      System.out.println("Using Calendar Class " + dateFormat.format(cal.getTime()));

		
	}

}
