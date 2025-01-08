package com.interview.INTERVIEW_HUSTLE.designPatterns;

import java.util.Arrays;
import java.util.List;

public class Demo 
{
	public static void main(String[] args) 
	{
		Demo demo1 = new Demo();
		
		Demo demo2 = new Demo();
		
		System.out.println(demo1 == demo2);
		
		List<String> name = Arrays.asList("sandeep", "kikripar","borkar");
		
//		name.add("sandeep");
		
		System.out.println(name);
		
	}

}
