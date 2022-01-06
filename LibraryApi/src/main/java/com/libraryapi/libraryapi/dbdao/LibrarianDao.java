package com.libraryapi.libraryapi.dbdao;

import com.libraryapi.libraryapi.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianDao extends JpaRepository<Librarian, String> {
}
