package com.example.demo.controller;




import com.example.demo.entity.Studentity;
import com.example.demo.service.StudentService;


@RestController
public class StudentController{
    @Autowired
    StudentService studentService;
    @PostMapping("/pastdata")
    public Studentity postdata(@RequestBody Studentity student){
        return studentService.saveStudent(student);
    }

}