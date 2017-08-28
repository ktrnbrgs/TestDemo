package com.forrest.springsmtp.controllers;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forrest.springsmtp.mail.MailSender;

@RestController
public class MailController {
	
	private MailSender mailSender;

	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		
		mailSender.send("katrina.burgos@oocl.com", "A Joke Test", "Cute mo po teh!");
		
		return "Mail sent";
	}
}
