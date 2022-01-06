package com.library.librarysystem.controller;

import com.library.librarysystem.api.Utility;
import com.library.librarysystem.constants.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    @PostMapping("/")
    public ModelAndView login(@RequestParam("username") String userName,
                              @RequestParam("password") String passWord,
                              HttpServletResponse servletResponse) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        if (Utility.getLibrarian(userName)) {
            if (Utility.checkLibrarianPassword(userName, passWord)) {
                servletResponse.sendRedirect("/Library");
            }
            modelAndView.addObject("loginStatus", Const.LOGIN_STATUS_BLOCK);
            modelAndView.addObject("loginStatusInfo", Const.LOGIN_FAIL);
            modelAndView.setViewName("index");
            return modelAndView;
        }
        modelAndView.addObject("loginStatus", Const.LOGIN_STATUS_BLOCK);
        modelAndView.addObject("loginStatusInfo", Const.LOGIN_NOAC);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
