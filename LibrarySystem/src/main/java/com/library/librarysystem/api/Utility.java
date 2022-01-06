package com.library.librarysystem.api;

import com.library.librarysystem.constants.Const;
import com.library.librarysystem.model.Author;
import com.library.librarysystem.model.Book;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility {
    private static final RestTemplate restTemplate = new RestTemplate();
    public static boolean getLibrarian(String userName) {
        Map<String, String> getUser = new HashMap<>();
        getUser.put("libUsername", userName);
        String request;
        try {
            request = restTemplate.getForObject(Const.GET_LIBRARIAN_API, String.class, getUser);
        } catch (Exception e) {
            return false;
        }
        String[] value = request.split("\"");
        return value[3].equals(userName);
    }

    public static boolean checkLibrarianPassword(String userName, String passWord) {
        Map<String, String> map = new HashMap<>();
        map.put("libUsername", userName);
        Map<String, String> request = restTemplate.getForObject(Const.GET_LIBRARIAN_API, Map.class, map);
        Const.USER_NAME = request.get("libUsername");
        return request.get("libPassword").equals(passWord);
    }

    public static List<Book> getAllBooks(){
        ResponseEntity<List<Book>> responseEntity =
                restTemplate.exchange(Const.GET_BOOKS,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {
                        });
        return responseEntity.getBody();
    }

    public static Book getBook(String bookCode){
        return restTemplate.getForObject(Const.GET_BOOK, Book.class, bookCode);
    }

    public static void deleteBook(String bookCode){
        restTemplate.delete(Const.DELETE_BOOK, bookCode);
    }

    public static List<Author> getAllAuthors(){
        ResponseEntity<List<Author>> responseEntity =
                restTemplate.exchange(Const.GET_ALL_AUTHORS,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Author>>() {
                        });
        return responseEntity.getBody();
    }

    public static void postBook(Book book) {
        restTemplate.postForEntity(Const.POST_BOOK, book, Book.class);
    }

    public static void putBook(Book book) {
        restTemplate.put(Const.POST_BOOK, book, Book.class);
    }

    public static String getDateToday(){
        Date date = new Date();
        String dateReturn;
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        dateReturn=formatter.format(date);
        return dateReturn;
    }
}
