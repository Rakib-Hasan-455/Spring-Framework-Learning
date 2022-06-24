package com.example.formvalidation;

import com.example.formvalidation.Entity.LoginData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@SpringBootApplication
@Controller
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String openForm(Model model) {
        System.out.println("Opening Form");
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    @RequestMapping("/submit")
    public String submitForm(@Valid @ModelAttribute LoginData loginData, BindingResult bindingResult) {
        System.out.println("Submitting Form");
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
        }
        System.out.println(loginData);
        return "form";
    }
}
