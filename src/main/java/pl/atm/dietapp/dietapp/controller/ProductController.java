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

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public String products(Model model, ProductDto productDto) {

        List<ProductDto> products = productService.findAll();
        if(productDto.getId()!=null) {
            Optional<Product> chosenProductOpt = productService.findByID(productDto.getId());
            Product chosenProduct = chosenProductOpt.get();
            model.addAttribute("chosenProduct", chosenProduct);
        }
        model.addAttribute("products", products);
        model.addAttribute("product", new ProductDto());
        return "products";
    }


//    @RequestMapping(value = { "/products" }, method = RequestMethod.GET)
//    public String list(Model model, ProductDto productDto){
//
//        model.addAttribute("chosenProduct", productDto);
//        System.out.println(productDto);
//
//        List<ProductDto> products = productService.findAll();
//        model.addAttribute("products", products);
//        model.addAttribute("product", new ProductDto());
//
//        return "redirect:products";
//
//    }

}
