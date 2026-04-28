package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return Html.getHtml();
    }

    @GetMapping("/check_my_pwd/{password}")
    public String checkPassword(@PathVariable String password) {
        return Function.check_password(password);
    }

}