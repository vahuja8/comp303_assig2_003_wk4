package com.va.week4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.va.week4.model.Student;
import com.va.week4.repo.StudentRepo;

@Controller
public class StudentEnrollmentController implements CommandLineRunner{

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/studentform")
	public String PhoneOrder(@ModelAttribute(name="student") Student student , Model m) {
		//Get the input values from the index page 
	String userName=student.getUserName();
	 //..
		// do for all the attirbutes.. and call the method repo.save to perfrom the Crud operation accordingly.
	//repo.save(student.getUserName());
	
		return "welcome-student";
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	//	repo.save(student.getUserName(), ...... ))
		
	}

}
