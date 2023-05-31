package chris.sample.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import chris.sample.sms.repository.StudentRepository;
import chris.sample.sms.entity.Student;

@SpringBootApplication
public class StudentManagementSystemSampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemSampleApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		
//		Student student1 = new Student("Tianchi", "Corpuz", "tianchicorpuz@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Juan", "Dela Cruz", "juandelacruz@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Jose", "Malbar", "josemalbar@gmail.com");
//		studentRepository.save(student3);
	}

}
