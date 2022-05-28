package com.aasurihome.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {

	@Bean
	@Scope("singleton")
	public Address getAddress() {
		int zip = (int)(10000 * Math.random());
		return new Address("Mountain View", "Amphitheatre Pkwy", 1600, zip);
	}
}
