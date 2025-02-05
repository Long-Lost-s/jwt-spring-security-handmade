package org.example.jwtspringsecurityhandmade.repository;

import org.example.jwtspringsecurityhandmade.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}
