package pl.atm.dietapp.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.atm.dietapp.dietapp.dto.UserDto;

import javax.validation.Valid;

@Controller
public class ProductController {

    @RequestMapping("products")
    public String products() {
        return "products";
    }

}
