package com.rfoliveira.ecommerceback.controller;

import com.rfoliveira.ecommerceback.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rfoliveira.ecommerceback.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        System.out.println("aqui");
        return bookService.saveBook(book);
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

}
