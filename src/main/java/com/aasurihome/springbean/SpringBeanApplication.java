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
		System.out.println("Company 1");
		System.out.println(address.getNumber() + " " + address.getStreet() + ", " + address.getCity() + " " + address.getZip());
		System.out.println("Employees=" + company.getEmployees());
		System.out.println();

		Company company2 = factory.getBean(Company.class);
		Address address2 = company2.getAddress();
		System.out.println("Company 2");
		System.out.println(address2.getNumber() + " " + address2.getStreet() + ", " + address2.getCity() + " " + address2.getZip());
		System.out.println("Employees=" + company2.getEmployees());
}

}
