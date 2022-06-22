package Project.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
// Passing data 2 way
// 1. Model -> model.addAttribute("Key", Object_Value);
// 2. Modelandview > model.addObject("Key", Object_Value);

@Controller
public class HomeController {

    // Model
    @RequestMapping("/home")
    public String home(Model model) {
        welcomeHeader(model);

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

    // Plain innocent Mapping
    @RequestMapping("/about")
    public String about(Model model) {
        welcomeHeader(model);
        System.out.println("this is about");
        return "about";
    }

    // ModelAndView
    @RequestMapping("/help")
    public ModelAndView help() {
        System.out.println("this is help page with ModelAndView");
        ModelAndView modelAndView = new ModelAndView();

        // adding data
        modelAndView.addObject("name", "Md. Rakibul Hasan");
        modelAndView.addObject("id", 2020144);

        modelAndView.addObject("currentTime", LocalDateTime.now());
        // setting view page name
        modelAndView.setViewName("help");
        return modelAndView;
    }
    public void welcomeHeader(Model model) {
        model.addAttribute("head", "Hellow, welcome.");
    }
}
