package com.example.demo0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class beginningController {

    @RequestMapping("/index")
    public String firstHandler() {
        System.out.println("Index page");
         return "index";
    }

}
