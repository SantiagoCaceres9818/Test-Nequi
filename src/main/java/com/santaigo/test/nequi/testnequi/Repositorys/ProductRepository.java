package com.santaigo.test.nequi.testnequi.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santaigo.test.nequi.testnequi.Models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
