package com.libraryapi.libraryapi.service;

import com.libraryapi.libraryapi.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();

    Author getAuthor(long authorId);

    Author addAuthor(Author author);

    Author updateAuthor(Author author);

    Author deleteAuthor(long authorId);
}
