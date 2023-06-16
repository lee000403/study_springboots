package com.example.study_springboots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan 
@SpringBootApplication
public class StudySpringbootsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringbootsApplication.class, args);
	}

}
