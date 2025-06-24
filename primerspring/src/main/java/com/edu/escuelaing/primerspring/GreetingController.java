package com.edu.escuelaing.primerspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String status() {
        return "{\"status\":\"Greetings from Spring Boot. "
            + java.time.LocalDate.now() + ", "
            + java.time.LocalTime.now()
            + ". " + "The server is Running!\"}";
    }

    @GetMapping("/hello")
    public String helloForm() {
        return "hello"; 
    }

    @PostMapping("/hello")
    @ResponseBody
    public String helloPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s!", name); 
    }
}