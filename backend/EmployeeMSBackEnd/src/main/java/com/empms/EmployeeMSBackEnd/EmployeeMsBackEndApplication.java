package com.empms.EmployeeMSBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.empms.Service","com.empms.Controller"})
@EntityScan(basePackages = {"com.empms.Entity"})
@EnableJpaRepositories(basePackages = "com.empms.Repository")
@SpringBootApplication
public class EmployeeMsBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMsBackEndApplication.class, args);
		System.out.println("Hello I am running");
	}

}
