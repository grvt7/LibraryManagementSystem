package com.library.librarysystem.controller;

import com.library.librarysystem.api.Utility;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class DeleteBookController {
    @PostMapping("RemoveBook")
    public void removeBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String bookCode = request.getParameter("etBook");
        Utility.deleteBook(bookCode);
        response.sendRedirect("/Library");
    }
}
