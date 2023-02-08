package com.xworkz.Fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Fi.DTO.InterviewDto;

@Component
@RequestMapping("/attend")
public class InterviewComponent {

	
	public InterviewComponent() {
	System.out.println("created " +getClass().getSimpleName());
	}
	
	@GetMapping
	public String onAttend(InterviewDto dto) {
		System.out.println("running InterviewDto...");
		System.out.println("dto is " +dto);
		return "Interview.jsp";
	}
}
