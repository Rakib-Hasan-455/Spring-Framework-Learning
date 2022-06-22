package Project.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {


    @RequestMapping("/one")
    public String one() {
        System.out.println("This is one handler ");
        return "redirect:/two";
    }

    @RequestMapping("/two")
    public String two() {
        System.out.println("This is two handler");
        return "contact";
    }

    // Using redirectView
    @RequestMapping("/three")
    public RedirectView three() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("two");
//      redirectView.setUrl("www.google.com");
        return redirectView;
    }
}
