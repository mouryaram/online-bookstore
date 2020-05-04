package com.mourya.harsha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mourya.harsha.entity.Book;

@CrossOrigin("http://localhost:4201")
public interface BookRepository extends JpaRepository<Book,Long> {

}
