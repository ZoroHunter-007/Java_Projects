package com.example.SpringSocialAuth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
				 .oauth2Login(oauth -> oauth
			                .defaultSuccessUrl("/homepage", true) // redirect here after successful login
			            )
				.build();
	}
}
