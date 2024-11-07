package org.youskim.shop.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class ShopController {

    @GetMapping("/test")
    public void test(Model model) {
        model.addAttribute("msg", "This is homepage");
    }

    @GetMapping("/home")
    public void home(Model model) {
        model.addAttribute("msg", "This is homepage");

    }
}
