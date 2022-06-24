package com.example.demo0;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/")
    public String home(Model model) {
        System.out.println("Inside Home handler");
        model.addAttribute("name", "Rakibul Hasan");
        model.addAttribute("mycompanyname", "Rakibs Trade");

        List list = new ArrayList<>();
        list.add("Rakib");
        list.add("Sakib");
        list.add("Takib");
        list.add("Zakib");
        model.addAttribute("namelist", list);
        return "index";
    }
}
