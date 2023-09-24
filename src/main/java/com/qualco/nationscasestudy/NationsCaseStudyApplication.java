package com.qualco.nationscasestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.qualco.nationscasestudy")
@EntityScan("com.qualco.nationscasestudy")
public class NationsCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NationsCaseStudyApplication.class, args);
	}

}
