package com.test.elastic.controller;

import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping (value = "/list")
    public String list() {
        return "list";
    }

    @GetMapping (value = "/add")
    public String add() {
        return "add";
    }

    @PostMapping (value = "/addok")
    public String addok() {
        return "redirect:/list";

    }
}
