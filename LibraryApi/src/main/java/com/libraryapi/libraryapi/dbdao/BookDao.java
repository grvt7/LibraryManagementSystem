package com.libraryapi.libraryapi.dbdao;

import com.libraryapi.libraryapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Long> {
}
