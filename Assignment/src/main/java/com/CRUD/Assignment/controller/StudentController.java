package com.CRUD.Assignment.controller;

import com.CRUD.Assignment.entity.Student;
import com.CRUD.Assignment.service.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentSevice studentSevice;

    public StudentController(StudentSevice studentSevice) {
        this.studentSevice = studentSevice;
    }
    public Student studentGet(){
      Student tempStudent1=  new Student();
      return tempStudent1;
    }
@PostMapping("/save")
    public Student saveStudent(@RequestBody Student tempStudent1){
     Student Output=   studentSevice.saveById(tempStudent1);
    //studentSevice.saveById(tempStudent1);
     return Output;


    }
}
