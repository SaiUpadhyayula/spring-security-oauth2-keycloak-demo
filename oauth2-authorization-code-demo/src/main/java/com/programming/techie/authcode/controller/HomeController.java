package com.programming.techie.authcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URISyntaxException;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() throws URISyntaxException {
        return "home";
    }
}
