package com.example.many_to_one.repository;

import com.example.many_to_one.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
