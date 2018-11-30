package pl.atm.dietapp.dietapp.service;

import org.springframework.stereotype.Service;
import pl.atm.dietapp.dietapp.dto.ProductDto;
import pl.atm.dietapp.dietapp.entity.Product;
import pl.atm.dietapp.dietapp.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void create(ProductDto productDto) {
        Product product = mapTo(productDto);
        productRepository.save(product);
    }

    private ProductDto mapTo(Product product) {
        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setAmount(product.getAmount());
        dto.setKcal(product.getKcal());
        dto.setCarbs(product.getCarbs());
        dto.setFat(product.getFat());
        dto.setProtein(product.getProtein());
        return dto;
    }

    private Product mapTo(ProductDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setAmount(dto.getAmount());
        product.setKcal(dto.getKcal());
        product.setCarbs(dto.getCarbs());
        product.setFat(dto.getFat());
        product.setProtein(dto.getProtein());
        return product;
    }

    /*


    private Task mapTo(TaskDto dto) {
        Task task = new Task();
        task.setId(dto.getId());
        task.setDescription(dto.getDescription());
        return task;
    }
     */


}
