package pl.atm.dietapp.dietapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.atm.dietapp.dietapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
