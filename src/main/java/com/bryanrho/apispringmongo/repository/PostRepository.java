package com.bryanrho.apispringmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bryanrho.apispringmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
