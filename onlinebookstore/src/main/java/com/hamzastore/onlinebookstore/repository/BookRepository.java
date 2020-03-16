package com.hamzastore.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzastore.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
