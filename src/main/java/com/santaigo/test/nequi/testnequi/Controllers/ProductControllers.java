package com.santaigo.test.nequi.testnequi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santaigo.test.nequi.testnequi.Models.Product;
import com.santaigo.test.nequi.testnequi.Services.ProductServices;

@RestController
@RequestMapping("/api/{officeId}/product")
public class ProductControllers {
    
    @Autowired
    private ProductServices productServices;

    @PostMapping
    public ResponseEntity<Product> addProduct (@PathVariable Long officeId, @RequestBody Product product) {
        return ResponseEntity.ok(productServices.addProduct(officeId, product));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long productId) {
        return ResponseEntity.ok(productServices.deleteProduct(productId));
    }
}
