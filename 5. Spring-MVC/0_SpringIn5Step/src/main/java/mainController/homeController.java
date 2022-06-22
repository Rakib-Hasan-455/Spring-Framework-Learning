package mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("this is home");
        return "home";
    }


    @RequestMapping("/about")
    public String about() {
        System.out.println("this is about");
        return "about";
    }
}
