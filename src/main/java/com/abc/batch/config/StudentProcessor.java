package com.abc.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.abc.batch.student.Student;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        // bussiness logic 
        student.setId(null);
        return student;
    }
}
