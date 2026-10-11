package com.issueforge.issueforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.issueforge.issueforge.service.IssueService;

@SpringBootApplication
public class IssueforgeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IssueforgeApplication.class, args);
		
		System.out.println(context.getBean(IssueService.class));
	}

}
