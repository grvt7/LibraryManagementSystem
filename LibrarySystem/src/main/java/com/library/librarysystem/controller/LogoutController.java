package com.library.librarysystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LogoutController {
    @GetMapping("Logout")
    public void logout(HttpServletResponse servletResponse) throws IOException {
        servletResponse.sendRedirect("/");
    }
}
