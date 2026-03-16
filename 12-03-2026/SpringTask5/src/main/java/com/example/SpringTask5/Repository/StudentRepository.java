package com.example.SpringTask5.Repository;

import com.example.SpringTask5.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
        List<Student> findByName(String name);

    @Query("SELECT s FROM Student s WHERE s.age > :age")
    List<Student> findStudentsOlderThan(@Param("age") int age);
    }

