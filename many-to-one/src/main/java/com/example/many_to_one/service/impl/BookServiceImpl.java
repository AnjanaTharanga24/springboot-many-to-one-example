package com.example.many_to_one.service.impl;

import com.example.many_to_one.model.Book;
import com.example.many_to_one.repository.BookRepository;
import com.example.many_to_one.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    public void create() {

        Book book = new Book(100L,"sherlock holmes");
        Book book1 = new Book(101L,"alan qurtermen");

         bookRepository.save(book);
         bookRepository.save(book1);
    }
}
