package org.example;

import org.example.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> productList;

    public ProductRepo() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productList);
    }
}
