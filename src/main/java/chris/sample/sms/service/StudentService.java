package chris.sample.sms.service;

import java.util.List;

import chris.sample.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long Id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
