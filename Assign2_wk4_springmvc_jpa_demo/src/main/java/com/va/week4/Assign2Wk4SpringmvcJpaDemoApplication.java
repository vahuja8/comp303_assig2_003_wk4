package com.va.week4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.va.week4.repo.StudentRepo;

@SpringBootApplication
public class Assign2Wk4SpringmvcJpaDemoApplication implements CommandLineRunner{
	
	StudentEnrollmentController s1 = new StudentEnrollmentController();
	
	@Autowired
	StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Assign2Wk4SpringmvcJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	//	repo.save(s1.run())
		
	}

}
