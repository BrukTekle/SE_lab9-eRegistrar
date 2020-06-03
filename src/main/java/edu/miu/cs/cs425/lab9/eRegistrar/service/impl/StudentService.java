package edu.miu.cs.cs425.lab9.eRegistrar.service.impl;

import edu.miu.cs.cs425.lab9.eRegistrar.model.Student;
import edu.miu.cs.cs425.lab9.eRegistrar.repository.StudentRepository;
import edu.miu.cs.cs425.lab9.eRegistrar.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student s) {
       return studentRepository.save(s);
    }

    @Override
    public Student findStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudent(Student s){
        studentRepository.delete(s);
    }

    @Override
    public Optional<Student> findStudentByStudentNumber(String num){
        return studentRepository.findStudentByStudentNumber(num);
    }

}
