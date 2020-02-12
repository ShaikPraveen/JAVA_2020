package com.java.InterviewPrograms;

public class TC04_Convert_String_Integer {
	// WAP TO CONVERT STRING TO INTEGER
	public static void main(String[] args) {
		String s = "1120";
		int i = Integer.parseInt(s);
		System.out.println(i);

		float f = Float.parseFloat(s);
		System.out.println(f);

		double d = Double.parseDouble(s);
		System.out.println(d);
	}
}
