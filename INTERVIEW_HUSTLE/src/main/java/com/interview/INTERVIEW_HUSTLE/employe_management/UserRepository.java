package com.interview.INTERVIEW_HUSTLE.employe_management;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{
    Optional<User> findByUsername(String username);
}
