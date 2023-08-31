package com.example.demo.tasks;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksController {
	
	@GetMapping
	public String getTasks(@AuthenticationPrincipal Jwt jwt) {
		
		return """
				<h1> Top secret tasks for %</h1>
				
				<ol>
					<li> Tasks 1</li>
					<li> Tasks 2</li>
					<li> Tasks 3</li>
				""".formatted(jwt.getSubject());
	}
}
