package com.CRUD.Assignment.service;

import com.CRUD.Assignment.dao.StudentRepository;
import com.CRUD.Assignment.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceEmpl implements StudentSevice{
    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceEmpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveById(Student theStudent) {
        //Student tempStudent=studentRepository.save(theStudent);
        Student tempStudent=studentRepository.save(theStudent);
        System.out.println(tempStudent.getEmail());
        System.out.println(tempStudent.getId());
        return tempStudent;

    }

    @Override
    public Student findById(int theId) {
        return null;
    }

    @Override
    public List<Student> fintAllAtudent() {
      //List<Student> tempStudent=  studentRepository.findAll();
      return studentRepository.findAll();
        //return tempStudent;
    }

    @Override
    public void deleteStudent(int theId) {

    }
}
