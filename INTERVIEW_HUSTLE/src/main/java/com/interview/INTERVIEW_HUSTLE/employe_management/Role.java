package com.interview.INTERVIEW_HUSTLE.employe_management;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role 
{
	@Id
	private String id;
	private String department;
	

}
