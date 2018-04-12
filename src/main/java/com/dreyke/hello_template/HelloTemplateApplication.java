package com.dreyke.hello_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class HelloTemplateApplication {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("author", "Dreyke");

        List favoriteFoods = Arrays.asList("buffalo wings", "pizza", "BBQ chips");
        model.addAttribute("favoriteFoods", favoriteFoods);
        model.addAttribute("favoriteTVShow", "True Detectives Season 1");
        return "index.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloTemplateApplication.class, args);
    }
}
