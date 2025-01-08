package com.interview.INTERVIEW_HUSTLE.employe_management;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>
{
	
}
