package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementSystemApplication implements CommandLineRunner{
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

 	@Autowired
 	private StudentRepository studentRepository;
	
 	@Override
 	public void run(String... args) throws Exception {
		
		
 	}

}
