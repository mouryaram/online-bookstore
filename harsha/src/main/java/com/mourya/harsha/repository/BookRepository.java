package com.mourya.harsha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mourya.harsha.entity.Book;


public interface BookRepository extends JpaRepository<Book,Long> {

}
