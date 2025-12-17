package com.example.demo.Serviceimpl;
import org.springframework.sterotype.Service;
import com.example.demo.entity.Student;
import 
}com.example.demo.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService{
    private final StudentRepository studentRepository;
    public StudentServiceimpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
public Student saveStudent (Student student){
    return studentRepository.save(student);
}