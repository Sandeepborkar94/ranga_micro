package com.interview.INTERVIEW_HUSTLE.logical;

public class FinallyBlockExample 
{
	public static void main(String[] args) 
	{
		int result = divide(10,0);
		
		System.out.println("Result: "+result);
	}

	private static int divide(int i, int j)
	{
		
		try 
		{
			return i/j;
			
		} catch (ArithmeticException e)
		{
			System.out.println("Exception Caught : "+e.getMessage());
			
			return -1;
		}finally 
		{
			System.out.println("finally block executed");
		}
	}

}
