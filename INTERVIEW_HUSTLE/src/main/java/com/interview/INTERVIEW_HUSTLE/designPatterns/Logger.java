package com.interview.INTERVIEW_HUSTLE.designPatterns;

public class Logger
{
	
	// this is the example is singlton design pattern
	private static Logger logger;

	private Logger() {}

	public static Logger getInstance() 
	{
		if (logger == null) 
		{
			logger = new Logger();
		}

		return logger;
	}
	
	public void log(String message) 
	{
		System.out.println(message);
	}
	
	public static void main(String[] args) 
	{
		
		
		Logger logger1 = Logger.getInstance();
		
		logger1.log("this is first singleton object");
		
		Logger logger2 = Logger.getInstance();
		
		logger2.log("this is second singleton object");
		
		System.out.println(logger1 == logger2 );
		
	}
}
