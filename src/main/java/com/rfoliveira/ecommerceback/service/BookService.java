package com.rfoliveira.ecommerceback.service;


import com.rfoliveira.ecommerceback.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import com.rfoliveira.ecommerceback.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
