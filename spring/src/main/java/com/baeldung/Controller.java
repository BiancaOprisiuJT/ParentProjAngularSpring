package com.baeldung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controller {
    @GetMapping("/message")
    public String getMessage() {
        return "Hello, this is a simple message from the backend!";
    }
}
