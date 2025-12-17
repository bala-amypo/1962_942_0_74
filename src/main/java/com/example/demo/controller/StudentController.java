package com.example.demo.controller;







@RestController
public class StudentController{
    @Autowired
    StudentService studentService;
    @PostMapping("/pastdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

}