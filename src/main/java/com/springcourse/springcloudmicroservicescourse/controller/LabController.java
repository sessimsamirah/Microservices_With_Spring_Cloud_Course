package com.springcourse.springcloudmicroservicescourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LabController {
    @GetMapping("/")
    public String method () {
        return "Hello World";
    }
}
