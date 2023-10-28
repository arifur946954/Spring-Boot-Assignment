package com.CRUD.Assignment.controller;

import com.CRUD.Assignment.entity.Student;
import com.CRUD.Assignment.service.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class StudentController {
    @Autowired
    private StudentSevice studentSevice;

    public StudentController(StudentSevice studentSevice) {
        this.studentSevice = studentSevice;
    }

    @GetMapping("/home")
    public String home(){
        return "/home";

    }
    @GetMapping("/registration")
    public String studentGet(Model theModel){
      Student tempStudent1=  new Student();
      theModel.addAttribute(tempStudent1);
      return "/student-reg";
    }
@PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student tempStudent1){
     Student Output=   studentSevice.saveById(tempStudent1);
    //studentSevice.saveById(tempStudent1);
     return "/student-list";


    }
    @GetMapping("/studentget")
    public List<Student> findAllStudent(){
       //List<Student> tempStudent= studentSevice.fintAllAtudent();
       return studentSevice.fintAllAtudent();
    }


}
