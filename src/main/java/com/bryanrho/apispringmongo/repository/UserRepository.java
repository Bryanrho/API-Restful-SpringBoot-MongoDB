package com.bryanrho.apispringmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bryanrho.apispringmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
