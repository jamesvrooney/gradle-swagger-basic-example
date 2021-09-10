package com.example.librarydemo.service;

import example.model.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {
    @Override
    public List<Book> getAllBooks() {
        Book book1 = new Book();
        book1.setAuthor("Charles Dickens");
        book1.setName("Oliver Twist");

        Book book2 = new Book();
        book2.setAuthor("Ian Fleming");
        book2.setName("Dr. No");

        Book book3 = new Book();
        book3.setAuthor("JK Rowling");
        book3.setName("Harry Potter");

        List<Book> books = Arrays.asList(book1, book2, book3);

        return books;
    }
}
