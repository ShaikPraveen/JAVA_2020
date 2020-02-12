package com.java.Handling.Dates;

import java.util.Calendar;

public class Handling_GetDays_Month 
{
	//How to get days in a month in Java
	public static void main(String[] args)
	{
		//display number of days of current month
		Calendar cal=Calendar.getInstance();
		System.out.println("DAYS IN CURRENT MONTH "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		
		//display number of days in February
        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
        System.out.println("DAYS IN FEBRUARY MONTH "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
