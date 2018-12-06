package pl.atm.dietapp.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.atm.dietapp.dietapp.dto.ProductDto;
import pl.atm.dietapp.dietapp.service.ProductService;

import javax.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    @RequestMapping
    public String products() {
        return "productForm";
    }

    @PostMapping
    public String create(@Valid @ModelAttribute("product")ProductDto product) {
        productService.create(product);
        return "productForm";
    }

}
