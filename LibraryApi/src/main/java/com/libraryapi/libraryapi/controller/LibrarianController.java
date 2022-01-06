package com.libraryapi.libraryapi.controller;

import com.libraryapi.libraryapi.model.Librarian;
import com.libraryapi.libraryapi.service.LibrarianService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibrarianController {
    private final LibrarianService librarianService;

    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    @GetMapping("/librarians")
    private List<Librarian> getLibrarians() {
        return this.librarianService.getAllLibrarians();
    }

    @GetMapping("/librarians/{libUsername}")
    private Librarian getLibrarian(@PathVariable String libUsername) {
        return this.librarianService.getLibrarian(libUsername);
    }

    @PostMapping("/librarians")
    private Librarian postLibrarian(@RequestBody Librarian librarian) {
        return this.librarianService.addLibrarian(librarian);
    }

    @PutMapping("/librarians")
    private Librarian putLibrarian(@RequestBody Librarian librarian) {
        return this.librarianService.updateLibrarian(librarian);
    }

    @DeleteMapping("/librarians/{libUsername}")
    private Librarian deleteLibrarian(@PathVariable String libUsername) {
        return this.librarianService.deleteLibrarian(libUsername);
    }
}
