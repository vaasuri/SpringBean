package com.aasurihome.springbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Demonstrates configuring injection through auto-wiring (see Company class) and
 * through configuration (see Config and Address classes).  
 */
@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(SpringBeanApplication.class, args);
		Company company = factory.getBean(Company.class);
		Address address = company.getAddress();
		System.out.println(address.getNumber() + " " + address.getStreet() + ", " + address.getCity() + " " + address.getZip());
	}

}
