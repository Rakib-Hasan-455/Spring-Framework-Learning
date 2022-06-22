package Project.mainController;

import Project.Model.User;
import Project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @RequestMapping("/contact")
    public String contact(Model model) {
        welcomeHeader(model);
        return "contact";
    }

    // Model Attribute
    @RequestMapping(path = "/submitMessage", method = RequestMethod.POST)
    public String submitMessageModelAttribute(@ModelAttribute User user, Model model) {
        welcomeHeader(model);
        int id = this.userService.createUser(user);
        model.addAttribute("userID", id);
        System.out.println(user);
        return "submitMessage";
    }

    public void welcomeHeader(Model model) {
        model.addAttribute("head", "Hellow, welcome.");
    }
}
