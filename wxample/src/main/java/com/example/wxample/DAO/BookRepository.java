package com.example.wxample.DAO;

import com.example.wxample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book,Integer>{
}