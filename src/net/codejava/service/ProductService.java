package net.codejava.service;

import net.codejava.models.Product;
import net.codejava.repo.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
     @Autowired
     ProductsRepository productsRepository;

    public void saveProduct(Product product){
        productsRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productsRepository.findAll();
    }

    public Product geProductById(Long id){
        return productsRepository.findById(id).get();
    }

}
