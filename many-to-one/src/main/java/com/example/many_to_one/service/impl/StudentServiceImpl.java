package com.example.many_to_one.service.impl;

import com.example.many_to_one.model.Book;
import com.example.many_to_one.model.Student;
import com.example.many_to_one.repository.BookRepository;
import com.example.many_to_one.repository.StudentRepository;
import com.example.many_to_one.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private BookRepository bookRepository;
    private StudentRepository studentRepository;
    @Override
    public void create(Long bId) {
        Optional<Book> book = bookRepository.findById(bId);

        if(!book.isPresent()){

        }

        Book book1 = book.get();
        Student student = new Student(200L,"anjana",book1);
        Student student1 = new Student(300L,"tharanga",book1);


        studentRepository.save(student);
        studentRepository.save(student1);

    }
}
