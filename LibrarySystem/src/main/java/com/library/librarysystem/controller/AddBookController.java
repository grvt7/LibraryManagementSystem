package com.library.librarysystem.controller;

import com.library.librarysystem.api.Utility;
import com.library.librarysystem.constants.Const;
import com.library.librarysystem.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AddBookController {
    @GetMapping("Add")
    public ModelAndView addBookPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", Const.USER_NAME);
        modelAndView.addObject("authors", Utility.getAllAuthors());
        modelAndView.addObject("dateToday", Utility.getDateToday());
        modelAndView.setViewName("addBook");
        return modelAndView;
    }

    @PostMapping(value = "Add", params = "submit")
    public void submitBook(@RequestParam("bookCode") String id,
                           @RequestParam("bookName") String name,
                           @RequestParam("bookAuthor") String author,
                           HttpServletResponse servletResponse) throws IOException {
        Book book = new Book(Long.parseLong(id), name, author, Utility.getDateToday());
        Utility.postBook(book);
        servletResponse.sendRedirect("/Library");
    }

    @PostMapping(path = "Add", params = "cancel")
    public void cancel(HttpServletResponse servletResponse) throws IOException {
        servletResponse.sendRedirect("/Library");
    }
}
