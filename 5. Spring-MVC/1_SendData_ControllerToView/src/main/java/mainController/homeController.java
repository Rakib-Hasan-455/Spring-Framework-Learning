package mainController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

// Passing data 2 way
// 1. Model -> model.addAttribute("Key", Object_Value);
// 2. Modelandview > model.addObject("Key", Object_Value);

@Controller
public class homeController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Rakib ul Hasan");
        model.addAttribute("id", 2020144);

        List<String> friendsList = new ArrayList<>();
        friendsList.add("Sakib");
        friendsList.add("Nakib");
        friendsList.add("Sabit");

        model.addAttribute("friendList", friendsList);
        System.out.println("this is home");
        return "home";
    }


    @RequestMapping("/about")
    public String about() {
        System.out.println("this is about");
        return "about";
    }
}
