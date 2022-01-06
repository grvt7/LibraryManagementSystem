package com.libraryapi.libraryapi.controller;

import com.libraryapi.libraryapi.model.Author;
import com.libraryapi.libraryapi.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    private List<Author> getAuthors(){
        return this.authorService.getAllAuthors();
    }

    @GetMapping("/authors/{authorId}")
    private Author getAuthor(@PathVariable String authorId) {
        return this.authorService.getAuthor(Long.parseLong(authorId));
    }

    @PostMapping("/authors")
    private Author postAuthor(@RequestBody Author author) {
        return this.authorService.addAuthor(author);
    }

    @PutMapping("/authors")
    private Author putAuthor(@RequestBody Author author) {
        return this.authorService.updateAuthor(author);
    }

    @DeleteMapping("/authors/{authorId}")
    private Author deleteAuthor(@PathVariable String authorId) {
        return this.authorService.deleteAuthor(Long.parseLong(authorId));
    }
}
