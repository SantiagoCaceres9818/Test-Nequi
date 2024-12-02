package com.santaigo.test.nequi.testnequi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santaigo.test.nequi.testnequi.Models.Office;
import com.santaigo.test.nequi.testnequi.Models.Product;
import com.santaigo.test.nequi.testnequi.Repositorys.OfficeRepository;
import com.santaigo.test.nequi.testnequi.Repositorys.ProductRepository;

@Service
public class ProductServices {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OfficeRepository officeRepository;


    public Product addProduct (Long officeId, Product product){
        Office office = officeRepository.findById(officeId).orElse(null);
        if(office != null){
            product.setOffice(office);
            return productRepository.save(product);
        }
        return null;
    }

    public Product updateStock (Long productId, int newStock) {
        Product product = productRepository.findById(productId).orElse(null);
        if(product != null){
            product.setStock(newStock);
            return productRepository.save(product);
        }
        return null;
    }

    public Product deleteProduct (Long productId) {
        Product product = productRepository.findById(productId).orElse(null);
        if(product != null ){
            Office office = officeRepository.findById(productId).orElse(null);
            if(office != null){
                office.getProducts().remove(product);
                officeRepository.save(office);
                productRepository.delete(product);
            }
        }
        return null;
    }
}
