package com.ecommerce.service;

public class ProductService {
    private ProductDao productDao;

    public ProductService() {
        this.productDao = new ProductDao();
    }

    public void addProduct(String name, double price, int stock) {
        productDao.addProduct(new Product(name, price, stock));
    }

    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }
}
