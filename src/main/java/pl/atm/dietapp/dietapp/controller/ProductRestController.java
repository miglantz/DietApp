package pl.atm.dietapp.dietapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.atm.dietapp.dietapp.dto.ProductDto;
import pl.atm.dietapp.dietapp.service.ProductService;

import javax.validation.Valid;

@RestController("/product")
public class ProductRestController {

    private ProductService productService;

    @PostMapping
    public void create(@Valid @RequestBody ProductDto product) {
        productService.create(product);
    }
}
