package com.ecommerce.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {

    @GetMapping("/say-hello")
    public @ResponseBody
    String getWelcomeMessage(){
        return "Welcome to my first spring application";

    }
}
