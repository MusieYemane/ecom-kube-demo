package com.mosi.kubernetesdemo.repo;

import com.mosi.kubernetesdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}