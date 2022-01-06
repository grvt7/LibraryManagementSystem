package com.libraryapi.libraryapi.controller;

import com.libraryapi.libraryapi.model.Book;
import com.libraryapi.libraryapi.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    private List<Book> getBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{bookCode}")
    private Book getBook(@PathVariable String bookCode) {
        return this.bookService.getBook(Long.parseLong(bookCode));
    }

    @PostMapping("/books")
    private Book postBook(@RequestBody Book book) {
        return this.bookService.addBook(book);
    }

    @PutMapping("/books")
    private Book putBook(@RequestBody Book book) {
        return this.bookService.updateBook(book);
    }

    @DeleteMapping("/books/{bookCode}")
    private Book deleteBook(@PathVariable String bookCode) {
        return this.bookService.deleteBook(Long.parseLong(bookCode));
    }
}
