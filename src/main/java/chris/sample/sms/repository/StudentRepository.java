package chris.sample.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chris.sample.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
