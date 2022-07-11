package com.ecommerce.demo.services;

import com.ecommerce.demo.models.Product;
import com.ecommerce.demo.repositories.ProductRepositoriy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EcommerceService {

    @Autowired
    ProductRepositoriy productRepositoriy;

    //Product
    public List<Product> getProducts(){
        return productRepositoriy.findAll();
    }

    public Product getProduct(int id){
        Optional<Product> result =  productRepositoriy.findById(id);
        Product product=null;
        if(result.isPresent()){
            product=result.get();
        }
        else{
            return null;
        }
        return product;
    }

    public  Product saveProduct(Product product){
        return productRepositoriy.save(product);
    }

}
