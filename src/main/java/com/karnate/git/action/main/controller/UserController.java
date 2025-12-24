package com.karnate.git.action.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class UserController {

    @GetMapping(value = "world")
    public String showMessage(){
        return "Hello World";
    }

}
