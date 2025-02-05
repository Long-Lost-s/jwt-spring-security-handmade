package org.example.jwtspringsecurityhandmade.service.product;

import org.example.jwtspringsecurityhandmade.model.Product;
import org.example.jwtspringsecurityhandmade.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product save(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
