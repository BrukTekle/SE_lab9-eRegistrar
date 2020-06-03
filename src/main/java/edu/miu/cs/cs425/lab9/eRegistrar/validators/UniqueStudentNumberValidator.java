package edu.miu.cs.cs425.lab9.eRegistrar.validators;

import edu.miu.cs.cs425.lab9.eRegistrar.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueStudentNumberValidator implements ConstraintValidator<UniqueStudentNumber, String> {

    private StudentService studentService;

    public UniqueStudentNumberValidator() {
    }

    @Autowired
    public UniqueStudentNumberValidator(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void initialize(UniqueStudentNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String num, ConstraintValidatorContext context) {
        boolean valid;
        if(studentService != null) {
            valid = (num != null && !studentService.findStudentByStudentNumber(num).isPresent());
        } else {
            valid = true;
        }
        return valid;
    }
}
