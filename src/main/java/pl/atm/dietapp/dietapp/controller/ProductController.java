package pl.atm.dietapp.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/", "products"})
public class ProductController {

    @RequestMapping("/test")
    public String products() {
        return "products";
    }

}
