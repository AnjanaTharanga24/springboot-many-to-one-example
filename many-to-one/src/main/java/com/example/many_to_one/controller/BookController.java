package com.example.many_to_one.controller;

import com.example.many_to_one.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookController {

    private BookService bookService;
    @PostMapping("/books")
    public void createBooks(){
       bookService.create();
    }
}
