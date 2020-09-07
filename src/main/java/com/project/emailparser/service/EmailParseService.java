package com.project.emailparser.service;

import java.util.List;

import com.project.emailparser.entity.EmailParseEntity;

public interface EmailParseService {

	EmailParseEntity create(EmailParseEntity emailParseEntity);
	List<EmailParseEntity> getAll();
}
