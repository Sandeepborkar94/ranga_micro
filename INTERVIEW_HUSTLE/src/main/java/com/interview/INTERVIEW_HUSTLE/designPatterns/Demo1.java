package com.interview.INTERVIEW_HUSTLE.designPatterns;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Integer val1 = 100;
		
		Integer val2 = 2;
		
//		Integer val4 =(val1%=3);
		
		Integer val3 = val1%=3 + ++val1 + val2--;
		
//		Integer val3 = val4 + ++val1 + val2--;
		
		System.out.println(val3);
		
	}

}
