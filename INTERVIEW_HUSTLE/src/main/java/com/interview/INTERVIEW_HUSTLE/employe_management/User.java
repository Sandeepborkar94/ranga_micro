package com.interview.INTERVIEW_HUSTLE.employe_management;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User 
{
	@Id
    private String id;
    private String username;
    private String password;
    private String department;

//    @DBRef creates references between collections in MongoDB. It is optional but helpful for linking users and roles.
    
    @DBRef
    private Set<Role> roles;
    
}
