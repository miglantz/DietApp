package pl.atm.dietapp.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.atm.dietapp.dietapp.enums.Activity;
import pl.atm.dietapp.dietapp.enums.Aim;
import pl.atm.dietapp.dietapp.enums.Gender;

@Controller
@RequestMapping("/bmr")
public class MetabolicRateRestController {


    @RequestMapping
    public String caloriescalc(){
        return "bmr";
    }

    @PostMapping
    public @ResponseBody double metabolicRate(
             @RequestParam("gender") String gender,
             @RequestParam("weight")double weight,
             @RequestParam("height")double height,
             @RequestParam("age")int age,
             @RequestParam("physical.activity")String activityString,
             @RequestParam("aim")String aimString) {
        double result = 0;
        if (gender.equals(Gender.MALE.toString().toLowerCase())) {
            result = 66 + 13.7 * weight + 5 * height - 6.76 * age;
        } else if (gender.equals(Gender.FEMALE.toString().toLowerCase())) {
            result = 655 + 9.6 * weight + 1.8 * height - 4.7 * age;
        }
        Activity activity = Activity.valueOf(activityString.toUpperCase());
        Aim aim = Aim.valueOf(aimString.toUpperCase());
        result = result * activity.getFactor() + aim.getKcal();
        return Math.round(result);
    }

}
