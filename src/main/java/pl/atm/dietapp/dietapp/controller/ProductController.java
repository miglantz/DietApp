package pl.atm.dietapp.dietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.atm.dietapp.dietapp.dto.ProductDto;
import pl.atm.dietapp.dietapp.dto.UserDto;
import pl.atm.dietapp.dietapp.entity.Product;
import pl.atm.dietapp.dietapp.service.ProductService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    @RequestMapping
    public String products() {
        return "productForm";
    }

    @PostMapping
    public String create(@Valid @ModelAttribute("product") ProductDto product) {
        productService.create(product);
        return "productForm";
    }
//    usuwa produkty z bazy danych
//    @GetMapping
//    public String products(Model model, ProductDto productDto) {
//
//        List<ProductDto> products = productService.findAll();
//        if(productDto.getId()!=null) {
//            Optional<Product> chosenProductOpt = productService.findByID(productDto.getId());
//            Product chosenProduct = chosenProductOpt.get();
//            model.addAttribute("chosenProduct", chosenProduct);
//        }
//        model.addAttribute("products", products);
//        model.addAttribute("product", new ProductDto());
//        return "products";
//    }


}

