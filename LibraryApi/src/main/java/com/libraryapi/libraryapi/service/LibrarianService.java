package com.libraryapi.libraryapi.service;

import com.libraryapi.libraryapi.model.Librarian;

import java.util.List;

public interface LibrarianService {
    List<Librarian> getAllLibrarians();

    Librarian getLibrarian(String libUsername);

    Librarian addLibrarian(Librarian librarian);

    Librarian updateLibrarian(Librarian librarian);

    Librarian deleteLibrarian(String libUsername);
}
