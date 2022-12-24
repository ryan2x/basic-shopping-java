package org.tutorial.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ryanxu
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String homePage() {
        return "Hello, World!";
    }
}
