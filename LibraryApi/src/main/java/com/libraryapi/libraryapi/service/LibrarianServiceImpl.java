package com.libraryapi.libraryapi.service;

import com.libraryapi.libraryapi.dbdao.LibrarianDao;
import com.libraryapi.libraryapi.model.Librarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrarianServiceImpl implements LibrarianService{
    private final LibrarianDao librarianDao;

    public LibrarianServiceImpl(LibrarianDao librarianDao) {
        this.librarianDao = librarianDao;
    }

    @Override
    public List<Librarian> getAllLibrarians() {
        return this.librarianDao.findAll();
    }

    @Override
    public Librarian getLibrarian(String libUsername) {
        return this.librarianDao.getById(libUsername);
    }

    @Override
    public Librarian addLibrarian(Librarian librarian) {
        return this.librarianDao.save(librarian);
    }

    @Override
    public Librarian updateLibrarian(Librarian librarian) {
        return this.librarianDao.save(librarian);
    }

    @Override
    public Librarian deleteLibrarian(String libUsername) {
        Librarian entity = this.librarianDao.getById(libUsername);
        this.librarianDao.delete(entity);
        return entity;
    }
}
