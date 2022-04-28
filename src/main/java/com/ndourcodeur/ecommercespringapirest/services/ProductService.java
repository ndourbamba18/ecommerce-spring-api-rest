package com.ndourcodeur.ecommercespringapirest.services;

import com.ndourcodeur.ecommercespringapirest.entities.Product;
import com.ndourcodeur.ecommercespringapirest.exception.ProductNotFoundException;
import com.ndourcodeur.ecommercespringapirest.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getProducts () {
        return repo.findAll();
    }

    public Product getProduct (Long idProduct) {
        return repo.findById(idProduct).orElseThrow(() ->
                new ProductNotFoundException("Product by id " + idProduct + " was not found."));
    }

    public Product addProduct (Product product) {
        return repo.save(product);
    }

    public Product updateProduct (Long idProduct, Product product) {
        Product existingProduct = getProduct(idProduct);

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setImage(product.getImage());

        return repo.save(existingProduct);
    }

    public void deleteProduct (Long idProduct) {
        repo.deleteById(idProduct);
    }
}
