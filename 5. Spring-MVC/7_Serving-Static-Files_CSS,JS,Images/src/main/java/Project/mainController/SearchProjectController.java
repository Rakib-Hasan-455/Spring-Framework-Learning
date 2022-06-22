package Project.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchProjectController {
    @RequestMapping(path = "/search", method = RequestMethod.POST)
    public RedirectView search(@RequestParam("searchtext") String searchText) {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.google.com/search?q="+searchText);
        return redirectView;
    }

    @RequestMapping("/searchForm")
    public String searchForm() {
        return "searchForm";
    }
}
