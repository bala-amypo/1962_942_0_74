package com.example.demo.Serviceimpl;
import org.springframework.sterotype.Service;
import com.example.demo.entity.Studentity;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService{
    private final StudentRepository studentRepository;
    public StudentServiceimpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
public Studentity saveStudent (Studentity student){
    return studentRepository.save(student);
}