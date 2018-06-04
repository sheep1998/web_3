package com.example.wxample.Controller;

import com.example.wxample.Service.BookService;
import com.example.wxample.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/book/all")
    @ResponseBody
    public List<Book> queryAllBook(){
        return bookService.queryAllBook();
    };
}
