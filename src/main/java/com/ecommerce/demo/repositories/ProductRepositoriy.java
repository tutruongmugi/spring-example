package com.ecommerce.demo.repositories;

import com.ecommerce.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoriy extends JpaRepository<Product,Integer> {
}
