package com.tutorial.demo.Controllers;

import java.util.List;

import com.tutorial.demo.Models.Student;
import com.tutorial.demo.Repositories.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @GetMapping("getallstudents")
    public List<Student> GetAllStudents() {
        return studentRepo.GetAllStudents();
    }
}
