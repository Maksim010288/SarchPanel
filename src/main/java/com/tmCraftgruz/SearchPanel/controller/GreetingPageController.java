package com.tmCraftgruz.SearchPanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingPageController {

    @GetMapping("/")
    String greeting(){
        return "greetingPage";
    }
}
