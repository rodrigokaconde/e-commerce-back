package com.rfoliveira.ecommerceback.repository;

import com.rfoliveira.ecommerceback.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
