package com.example.wxample.Service.ServiceImpl;

import com.example.wxample.DAO.BookRepository;
import com.example.wxample.Service.BookService;
import com.example.wxample.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> queryAllBook() {
        List<Book> books=bookRepository.findAll();
        return books;
    }
}
