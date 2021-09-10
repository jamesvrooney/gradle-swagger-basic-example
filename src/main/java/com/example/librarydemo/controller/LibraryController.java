package com.example.librarydemo.controller;


import com.example.librarydemo.service.LibraryService;
import example.api.LibraryApi;
import example.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LibraryController implements LibraryApi {

    private final LibraryService libraryService;

    @Override
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = libraryService.getAllBooks();

        return ResponseEntity.ok().body(books);
    }
}
