package com.app.library.controller;

import com.app.library.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private List<Book> books = new ArrayList<>();

    @GetMapping("/books")
    public List<Book> getBooks() {
        return books;
    }

    @PostMapping("/books")
    public String addBook(@RequestBody Book book) {
        books.add(book);
        return "Book added successfully!";
    }
}
