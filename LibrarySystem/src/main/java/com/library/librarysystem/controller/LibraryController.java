package com.library.librarysystem.controller;

import com.library.librarysystem.api.Utility;
import com.library.librarysystem.constants.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LibraryController {
    @GetMapping("/Library")
    public ModelAndView library() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", Const.USER_NAME);
        modelAndView.addObject("resultList" , Utility.getAllBooks());
        modelAndView.setViewName("library");
        return modelAndView;
    }
}
