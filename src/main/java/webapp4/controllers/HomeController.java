package webapp4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home/index")
    public String index() {
        return "home/index";
    }

    @GetMapping("/home/details")
    public String details() {
        return "home/details";
    }

    @GetMapping("/home/pr")
    public String pr() {
        return "home/pr";
    }
}







