package com.example.example.controller;

import com.example.example.model.Book;
import com.example.example.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService =  new BookService();

    @GetMapping("/book")
    public List getBook(){
        return bookService.getBookList();
    }
    @GetMapping("/book/byId/{id}")
    public String getBookById(@PathVariable("id") long id){
        return bookService.getBookById(id);
    }
    @GetMapping("/book/byTitle/{title}")
    public String getBookByName(@PathVariable("title") String title){
        return bookService.getBookByName(title);
    }
}
