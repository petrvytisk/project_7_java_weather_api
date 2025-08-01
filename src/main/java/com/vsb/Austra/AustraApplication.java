package com.vsb.Austra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AustraApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AustraApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder
														 applicationBuilder) {
		return applicationBuilder.sources(AustraApplication.class);
	}

}
