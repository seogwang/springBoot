package com.chunjae.test03.controller;

import com.chunjae.test03.domain.UserInfo;
import com.chunjae.test03.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class Usercontroller {
    @Autowired
    public UserService userService;

    @Autowired
    HttpSession session;

    @GetMapping("getUser")
    public String getUser(HttpServletRequest req, Model model) {
        String id = (String) session.getAttribute("sid");
        UserInfo user = userService.getUser(id);
        model.addAttribute("user", user);
        return ("/userInfo/getUser");
    }



}
