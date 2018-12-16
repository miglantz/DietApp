package pl.atm.dietapp.dietapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.atm.dietapp.dietapp.dto.ProductDto;
import pl.atm.dietapp.dietapp.service.ProductService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/products")
    public String create(@Valid @ModelAttribute("product") ProductDto product) {
        product.setAmount(100.0);
        productService.create(product);

        return "redirect:products";
    }

    @GetMapping("/products")
    public String displayAll(Model model) {
        List<ProductDto> allProducts = productService.findAll();
        model.addAttribute("product", new ProductDto());
        model.addAttribute("allProducts", allProducts);
        return "productForm";
    }

    @DeleteMapping("/products")
    public String deleteProduct(@Valid @ModelAttribute("product") ProductDto product) {
        productService.delete(product.getId());
        return "redirect:products";
    }
}

