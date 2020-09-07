package com.project.emailparser.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.emailparser.entity.EmailParseEntity;

public interface EmailParseRepository extends MongoRepository<EmailParseEntity, String>{

}
