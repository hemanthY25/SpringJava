package com.example1.hy.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example1.hy.demo")
public class Config {
	
	@Bean
	public String Name() {
		return "Hemanth";
	}
	
	@Bean
	public Company Company1() {
		return new Company( Name() );
	}
	
}
