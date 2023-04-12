package com.xworkz.sendingemail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class SendMail {

	//autowired service
	
	public SendMail() {
	log.info("send email");
	}
	
	
	
}
