package edu.miu.cs.cs425.lab9.eRegistrar.repository;

import edu.miu.cs.cs425.lab9.eRegistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByStudentNumber(String studentNumber);
//Optional<Student> findStudentByCgpa(Double cgpa);
}


