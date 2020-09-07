package com.project.emailparser.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.emailparser.entity.EmailParseEntity;
import com.project.emailparser.sendemail.SendEmail;
import com.project.emailparser.service.EmailParseService;

@RestController
public class emailController {

	@Autowired
	private EmailParseService emailParseService;
	
	private SendEmail sendEmail = new SendEmail();
	
	@PostMapping("/sendEmail")
	public EmailParseEntity create(@RequestBody EmailParseEntity emailParseEntity) {
	
		emailParseService.create(emailParseEntity);
		return emailParseEntity;
	}
	
	@GetMapping("/getEmail/{from}")
	public List<EmailParseEntity> getAll(@PathVariable String from){
		List<EmailParseEntity> email = emailParseService.getAll();
		List<EmailParseEntity> result = new ArrayList<>();
		for(EmailParseEntity innerEmail: email) {
			if(innerEmail.getFrom().equals(from)) 
				result.add(innerEmail);
		}
		if(result.size() == 0)
			throw new RuntimeException("There is no email with the email id " + from);
		
		return result;
	}
	
	@GetMapping("/sendReminder/{to}")
	public String sendReminderEmail(@PathVariable String to) {
		return sendEmail.sendMail(to);
	}
}
