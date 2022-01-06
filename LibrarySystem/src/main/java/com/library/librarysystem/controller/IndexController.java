package com.library.librarysystem.controller;

import com.library.librarysystem.constants.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("loginStatus", Const.LOGIN_STATUS_NONE);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
