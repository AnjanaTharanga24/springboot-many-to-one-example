package com.example.many_to_one.controller;

import com.example.many_to_one.repository.StudentRepository;
import com.example.many_to_one.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @PostMapping("/students/books/{book-id}")
    public void createStudent(@PathVariable("book-id")Long bId){
      studentService.create(bId);
    }
}
