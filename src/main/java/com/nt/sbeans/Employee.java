package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties(prefix = "emp.details")
@Data
public class Employee {
	private Integer eno;
	private String ename;
	private String eaddrs;

	private String[] favColors;

	private List<String> nickNames;
	private Set<Long> phoneNumber;
	private Map<String, Long> idDetails;

	private Project project;

}
