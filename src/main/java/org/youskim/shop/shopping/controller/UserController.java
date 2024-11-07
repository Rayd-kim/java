package org.youskim.shop.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.youskim.shop.shopping.dto.UserDTO;
import org.youskim.shop.shopping.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signin")
    public String signIn() {
        return "/signin";
    }

    @PostMapping("/signin")
    public String signin(@Validated UserDTO userDTO, Model model) {
        String userName = userService.signIn(userDTO);
        model.addAttribute("userName", userName);
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

//    @PostMapping("/login")
//    public String login(String userId, String userPassword, Model model) {
//
//    }

}
