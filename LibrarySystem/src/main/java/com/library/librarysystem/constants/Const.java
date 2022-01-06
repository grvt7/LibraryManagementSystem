package com.library.librarysystem.constants;

public class Const {
    public static String USER_NAME;
    //Login Status Config
    public static final String LOGIN_STATUS_NONE = "none";
    public static final String LOGIN_STATUS_BLOCK = "block";
    public static final String LOGIN_SUCCESS = "Login Successful";
    public static final String LOGIN_FAIL = "Login Failed! Enter Valid Details";
    public static final String LOGIN_NOAC = "Login Failed! Account Not Found";

    //Rest Templates
    public static final String GET_LIBRARIAN_API = "http://localhost:9090/librarians/{libUsername}";
    public static final String GET_ALL_AUTHORS = "http://localhost:9090/authors";
    public static final String GET_BOOKS = "http://localhost:9090/books";
    public static final String GET_BOOK = "http://localhost:9090/books/{bookCode}";
    public static final String DELETE_BOOK = "http://localhost:9090/books/{bookCode}";
    public static final String PUT_BOOK = "http://localhost:9090/books";
    public static final String POST_BOOK = "http://localhost:9090/books";
}
