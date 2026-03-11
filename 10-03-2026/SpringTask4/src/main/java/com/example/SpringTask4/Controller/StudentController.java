package com.example.SpringTask4.Controller;

import com.example.SpringTask4.Repository.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(new Student(1, "Rishi", 20),
            new Student(2, "Saiteja", 21),
            new Student(3, "Vijay", 22)));

    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return new ResponseEntity<>(s, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Student>> searchStudents(@RequestParam String name) {

        List<Student> result = new ArrayList<>();

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {

        students.add(student);

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable int id,
            @RequestBody Student updatedStudent) {

        for (Student s : students) {

            if (s.getId() == id) {

                s.setName(updatedStudent.getName());
                s.setAge(updatedStudent.getAge());

                return new ResponseEntity<>(s, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {

        boolean removed = students.removeIf(student -> student.getId() == id);
        if (removed) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}



