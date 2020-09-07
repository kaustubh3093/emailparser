package com.project.emailparser.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.emailparser.dao.EmailParseRepository;
import com.project.emailparser.entity.EmailParseEntity;

@Service
public class EmailParseServiceImpl implements EmailParseService {

	@Autowired
	private EmailParseRepository emailParseRepository;
	
	@Override
	public EmailParseEntity create(EmailParseEntity emailParseEntity) {
		emailParseEntity.setId(UUID.randomUUID().toString());
		emailParseRepository.insert(emailParseEntity);
		return emailParseEntity;
	}

	@Override
	public List<EmailParseEntity> getAll() {
		
		return emailParseRepository.findAll();
	}

	
}
