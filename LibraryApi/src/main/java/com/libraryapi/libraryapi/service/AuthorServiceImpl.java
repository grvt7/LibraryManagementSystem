package com.libraryapi.libraryapi.service;

import com.libraryapi.libraryapi.dbdao.AuthorDao;
import com.libraryapi.libraryapi.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{
    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public List<Author> getAllAuthors() {
        return this.authorDao.findAll();
    }

    @Override
    public Author getAuthor(long authorId) {
        return this.authorDao.getById(authorId);
    }

    @Override
    public Author addAuthor(Author author) {
        return this.authorDao.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return this.authorDao.save(author);
    }

    @Override
    public Author deleteAuthor(long authorId) {
        Author entity = this.authorDao.getById(authorId);
        this.authorDao.delete(entity);
        return entity;
    }
}
