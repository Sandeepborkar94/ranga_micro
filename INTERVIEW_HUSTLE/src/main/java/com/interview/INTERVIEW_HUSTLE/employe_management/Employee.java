package com.interview.INTERVIEW_HUSTLE.employe_management;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity // For JPA
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id; //mongodb uses String id's
	
	private String name;
	private String email;
	private String department;
	private String salary;
	
}
