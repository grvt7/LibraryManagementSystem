package com.library.librarysystem.controller;

import com.library.librarysystem.api.Utility;
import com.library.librarysystem.constants.Const;
import com.library.librarysystem.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class EditBookController {

    @PostMapping("EditBook")
    public ModelAndView editBookRender(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        String bookCode = request.getParameter("editCode");
        Book book = Utility.getBook(bookCode);
        modelAndView.addObject("username", Const.USER_NAME);
        modelAndView.addObject("thisBookCode", book.getBookCode());
        modelAndView.addObject("thisBookName", book.getBookName());
        modelAndView.addObject("authors", Utility.getAllAuthors());
        modelAndView.addObject("dateBookAdded", book.getDateAdded());
        modelAndView.setViewName("editBook");
        return modelAndView;
    }

    @PostMapping("Edit")
    public void Edit(@RequestParam("editCode") String id,
                     @RequestParam("bookName") String name,
                     @RequestParam("bookAuthor") String author,
                     @RequestParam("getDateToday") String date,
                     HttpServletResponse response) throws IOException {
        Book book = new Book(Long.parseLong(id), name, author, date);
        Utility.putBook(book);
        response.sendRedirect("/Library");
    }

    @PostMapping(path = "Edit", params = "cancel")
    public void cancel(HttpServletResponse servletResponse) throws IOException {
        servletResponse.sendRedirect("/Library");
    }
}
