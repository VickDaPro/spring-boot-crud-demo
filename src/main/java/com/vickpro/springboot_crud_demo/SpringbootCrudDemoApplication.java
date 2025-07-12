package com.vickpro.springboot_crud_demo;

import com.vickpro.springboot_crud_demo.dao.StudentDAO;
import com.vickpro.springboot_crud_demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);

//			createMultipleStudents(studentDAO);

			readStudent(studentDAO);
	};
}

	private void readStudent(StudentDAO studentDAO) {

		// Create a student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Daffy", "Doe", "daffydoe@vickpro.com");

		// save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students
		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("Paul", "Doe", "paul@vickpro.com");
		Student tempStudent2 = new Student("John", "Doe", "john@vickpro.com");
		Student tempStudent3 = new Student("Ram", "Doe", "ram@vickpro.com");

		// save the student objects
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@vickpro.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display is of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
