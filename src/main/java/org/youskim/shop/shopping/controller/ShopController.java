package org.youskim.shop.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/home")
    public void home(Model model) {
        model.addAttribute("msg", "This is homepage");
    }

}
