package com.java.Handling.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Handling_Differences_Between_Dates 
{
	//How to find difference between dates in Java
	public static void main(String[] args) {
		
		//Using Date Class
		try {
			  
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date1 = sdf.parse("2012-08-07 05:30:23");
            Date date2 = sdf.parse("2012-08-08 11:24:56");
      
            System.out.println("Date 1 " + sdf.format(date1));
            System.out.println("Date 2 " + sdf.format(date2));
            long difInMilliseconds = (int) ((date2.getTime() - date1.getTime()));
            long diffInSeconds =  (int) ((date2.getTime() - date1.getTime())/(1000));
            long diffInMinutes =  (int) ((date2.getTime() - date1.getTime())/(1000 * 60));
            long diffInHours =  (int) ((date2.getTime() - date1.getTime())/(1000 * 60 * 60));
            long difInDays = (int) ((date2.getTime() - date1.getTime())/(1000 * 60 * 60 * 24));
              
            System.out.println("\nMilliseconds = " + difInMilliseconds);
            System.out.println("Seconds = " + diffInSeconds);
            System.out.println("Hours = " + diffInMinutes);
            System.out.println("Hours = " + diffInHours);
            System.out.println("Days = " + difInDays);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
		
		
		//Using Calendar Class
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         
	        Calendar calendar1 = Calendar.getInstance();
	        Calendar calendar2 = Calendar.getInstance(); 
	        calendar1.set(2012, 8, 7, 05, 30, 23);
	        calendar2.set(2012, 8, 8, 11, 24, 56);
	        System.out.println("Date 1 " + sdf.format(calendar1.getTime()));
	        System.out.println("Date 2 " + sdf.format(calendar2.getTime()));
	          
	        long difInMilliseconds = (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis()));
	        long diffInSeconds =  (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis())/(1000));
	        long diffInMinutes =  (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis())/(1000 * 60));
	        long diffInHours =  (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis())/(1000 * 60 * 60));
	        long difInDays = (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis())/(1000 * 60 * 60 * 24));
	          
	        System.out.println("\nMilliseconds = " + difInMilliseconds);
	        System.out.println("Seconds = " + diffInSeconds);
	        System.out.println("Hours = " + diffInMinutes);
	        System.out.println("Hours = " + diffInHours);
	        System.out.println("Days = " + difInDays);

		
		
		
	}

}
