package com.libraryapi.libraryapi.service;

import com.libraryapi.libraryapi.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBook(long bookCode);

    Book addBook(Book book);

    Book updateBook(Book book);

    Book deleteBook(long bookCode);
}
