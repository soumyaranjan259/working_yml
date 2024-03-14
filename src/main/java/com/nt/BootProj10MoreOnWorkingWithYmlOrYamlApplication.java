package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj10MoreOnWorkingWithYmlOrYamlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(BootProj10MoreOnWorkingWithYmlOrYamlApplication.class, args);
		Employee emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		ctx.close();
	}

}
