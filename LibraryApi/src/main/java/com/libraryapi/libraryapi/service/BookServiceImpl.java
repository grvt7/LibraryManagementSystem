package com.libraryapi.libraryapi.service;

import com.libraryapi.libraryapi.dbdao.BookDao;
import com.libraryapi.libraryapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookDao.findAll();
    }

    @Override
    public Book getBook(long bookCode) {
        return this.bookDao.getById(bookCode);
    }

    @Override
    public Book addBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public Book deleteBook(long bookCode) {
        Book entity = this.bookDao.getById(bookCode);
        this.bookDao.delete(entity);
        return entity;
    }
}
