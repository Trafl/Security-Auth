package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class UserStoreConfig {

	@Bean
	UserDetailsManager userDetailsService() {
		var userDetailsManager = new InMemoryUserDetailsManager();
		
		userDetailsManager.createUser(
				User.withUsername("user")
					.password("{noop}password")
					.roles("USER")
					.build()
				);
		return userDetailsManager;
	}
}
