package pl.atm.dietapp.dietapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/", "homepage"})
public class HomePageController {

    @RequestMapping({"", "/", "homepage"})
    public String products() {
        return "homepage";
    }
}
