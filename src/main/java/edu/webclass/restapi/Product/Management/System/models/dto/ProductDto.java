package edu.webclass.restapi.Product.Management.System.models.dto;

import edu.webclass.restapi.Product.Management.System.models.Product;

public class ProductDto {
    public String title;
    public String brand;
    public int price;

    public ProductDto(Product product) {
        this.title = product.getTitle();
        this.brand = product.getBrand();
        this.price = product.getPrice();
    }


}
