package com.te.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.te.studentmanagementsystem.bean.Student;
import com.te.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1=new Student("Ram","kumar",89.5,"ram@gmail.com","A+");
		studentRepository.save(student1);
		
		Student student2=new Student("sanju","sri",75.3,"sanju@gmail.com","A");
		studentRepository.save(student2);
		
		Student student3=new Student("manju","sagar",69.1,"manju@gmail.com","A");
		studentRepository.save(student2);
		
		Student student4=new Student("tanu","shree",85.5,"tanu@gmail.com","A");
		studentRepository.save(student2);
		
	}

}
