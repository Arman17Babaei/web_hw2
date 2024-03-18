package edu.webclass.restapi.Product.Management.System.services;

import edu.webclass.restapi.Product.Management.System.models.Product;
import edu.webclass.restapi.Product.Management.System.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }

    public boolean addProduct(String title, String brand, int price) {
        return productRepository.createNewProduct(new Product(title, brand, price));
    }


    public Product getProduct(String id) {
        return productRepository.getProduct(id);
    }
}
