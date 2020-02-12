package com.java.Handling.Dates;


import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class Handling_Get_CurrentTimestamp 
{
	//How to get Current Timestamp in Java
	public static void main(String[] args) 
	{
		//Using Date Class
		//Date date= new Date();
        //System.out.println(new Timestamp(date.getTime()));
        
        //Using Calendar Class
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        System.out.println(new Timestamp(now.getTime()));
		
	}

}
