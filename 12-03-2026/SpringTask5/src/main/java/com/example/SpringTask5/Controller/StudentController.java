package com.example.SpringTask5.Controller;

import com.example.SpringTask5.Entity.Student;
import com.example.SpringTask5.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;
    public StudentController(StudentRepository repository){
        this.repository=repository;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @GetMapping("/students/name/{name}")
    public List<Student> getByName(@PathVariable String name) {
        return repository.findByName(name);
    }

    @GetMapping("/students/age/{age}")
    public List<Student> getOlderStudents(@PathVariable int age) {
        return repository.findStudentsOlderThan(age);
    }



}
