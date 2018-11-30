package pl.atm.dietapp.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caloriescalc")
public class CaloriesCalcController {

    @RequestMapping
    public String caloriescalc(){
        return "/caloriescalc/caloriescalc";
    }

    




}
