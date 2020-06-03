package edu.miu.cs.cs425.lab9.eRegistrar.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueStudentNumberValidator.class)
public @interface UniqueStudentNumber {
    String message() default "Student Number must be unique";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
