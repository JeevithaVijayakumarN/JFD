package com.nseit.EmployeeSample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class EmployeeSampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
