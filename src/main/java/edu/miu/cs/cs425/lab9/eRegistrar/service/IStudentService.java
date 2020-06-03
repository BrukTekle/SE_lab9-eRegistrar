package edu.miu.cs.cs425.lab9.eRegistrar.service;

import edu.miu.cs.cs425.lab9.eRegistrar.model.Student;

import java.util.Optional;


public interface IStudentService {
    Iterable<Student> getAllStudents();
    Student save(Student s);
    Student findStudentById(Long id);
    void deleteStudent(Student id);
    Optional<Student> findStudentByStudentNumber(String num);
}
