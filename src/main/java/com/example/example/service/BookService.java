package com.example.example.service;

import com.example.example.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {
        Book book = new Book(1,"nazwa");
        Book book1 = new Book(2,"nazwa1");
        Book book2 = new Book(3,"nazwa2");
        books.add(book);
        books.add(book1);
        books.add(book2);
    }
    public List getBookList() {
        return books;
    }

    public String getBookById(long id) {

        Book book = new Book();
        for(Book tmp: books){
            if(tmp.getId() == id){
                book = tmp;
                break;
            }
        }
        return book.toString();

    }
    public String getBookByName(String title) {
        Book book = new Book();
        for(Book tmp: books){
            if((tmp.getTitle()).equals(title)){
                book = tmp;
                break;
            }
        }
        return book.toString();
    }

}
