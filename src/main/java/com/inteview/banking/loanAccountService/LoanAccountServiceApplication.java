package com.inteview.banking.loanAccountService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoanAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAccountServiceApplication.class, args);
	}

}
