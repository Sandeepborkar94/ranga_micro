package com.interview.INTERVIEW_HUSTLE.java8.streams;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Demo 
{
	public static void main(String[] args) 
	{
		
		Employee[] arrayOfEmps = {
				
				new Employee(1, "sandeep", 1000d),
				new Employee(2, "shalu", 2000d)
				
		};
		
		Stream<Employee> emps = Stream.of(arrayOfEmps);
		
		Arrays.asList(arrayOfEmps);
		
		
		Stream<Employee> emps1 = Stream.of(arrayOfEmps[0], arrayOfEmps[1]);
		
		Stream.Builder<Employee> empStreamBuilder = Stream.builder();

		empStreamBuilder.accept(arrayOfEmps[0]);
		empStreamBuilder.accept(arrayOfEmps[1]);

		System.out.println();
		
		
//		Employee[] arrayOfEmps = { new Employee("1", "sandeep", "sandeep@gmail.com", "IT", "1000"),
//				new Employee("2", "shalu", "shalu@gmail.com", "HRD", "2000"),
//				new Employee("3", "Maithili", "maithili@gmail.com", "SIT", "3000") };

//		Stream.of(arrayOfEmps);

//		Arrays.asList(arrayOfEmps);

//		Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

//		Stream.Builder<Employee> empStreamBuilder = Stream.builder();
	}

}
