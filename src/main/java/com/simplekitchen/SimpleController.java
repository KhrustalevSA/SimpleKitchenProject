package com.simplekitchen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SimpleController {

    @GetMapping("/work")
    public String mainPage(){
        return "main page";
    }
}
