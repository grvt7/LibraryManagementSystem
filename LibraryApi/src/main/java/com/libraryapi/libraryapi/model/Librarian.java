package com.libraryapi.libraryapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Librarian {
    @Id
    @Column(name = "lib_username")
    private String libUsername;

    @Column(name = "lib_password")
    private String libPassword;

    public String getLibUsername() {
        return libUsername;
    }

    public void setLibUsername(String libUsername) {
        this.libUsername = libUsername;
    }

    public String getLibPassword() {
        return libPassword;
    }

    public void setLibPassword(String libPassword) {
        this.libPassword = libPassword;
    }
}
