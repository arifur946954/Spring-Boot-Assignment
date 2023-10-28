package com.CRUD.Assignment.service;

import com.CRUD.Assignment.entity.Student;

import java.util.List;

public interface StudentSevice {
    //save student
    Student saveById(Student theStudent);
    //find byid
    Student findById(int theId);
    //find by all
    List<Student> fintAllAtudent();
    //delete student
    void deleteStudent(int theId);
    //update student

}
