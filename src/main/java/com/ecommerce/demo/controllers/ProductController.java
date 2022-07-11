package com.ecommerce.demo.controllers;

import com.ecommerce.demo.models.Product;
import com.ecommerce.demo.services.EcommerceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private EcommerceService ecommerceService;

    public ProductController(EcommerceService ecommerceService) {
        this.ecommerceService = ecommerceService;
    }
    @GetMapping("products")
    public List<Product> getProducts(){
        return ecommerceService.getProducts();
    }

    @GetMapping("products/{productId}")
    public Product getProduct(@PathVariable int productId){
        Product product=ecommerceService.getProduct(productId);
        if(product!=null){

            return product;
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"couldn't found id - " + productId);
        }
    }

    @PostMapping("products")
    public Product addNewProduct(@RequestBody Product product){
        product.setId(0);
        ecommerceService.saveProduct(product);
        return product;
    }

}
