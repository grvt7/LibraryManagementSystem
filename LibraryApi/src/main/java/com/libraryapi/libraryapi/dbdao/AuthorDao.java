package com.libraryapi.libraryapi.dbdao;

import com.libraryapi.libraryapi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author, Long> {
}
