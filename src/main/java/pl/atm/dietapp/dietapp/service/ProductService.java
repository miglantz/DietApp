package pl.atm.dietapp.dietapp.service;

import org.springframework.stereotype.Service;
import pl.atm.dietapp.dietapp.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


}
