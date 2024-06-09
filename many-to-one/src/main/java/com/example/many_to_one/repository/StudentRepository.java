package com.example.many_to_one.repository;

import com.example.many_to_one.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
