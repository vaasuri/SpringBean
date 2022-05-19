package com.aasurihome.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {

	@Bean
	public Address getAddress() {
		return new Address("Mountain View", "Amphitheatre Pkwy", 1600, 94043);
	}
}
