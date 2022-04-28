package com.ndourcodeur.ecommercespringapirest.seeder;

import com.github.javafaker.Faker;
import com.ndourcodeur.ecommercespringapirest.entities.Product;
import com.ndourcodeur.ecommercespringapirest.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DatabaseTableSeeder implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static Faker faker = new Faker();

    @Override
    public void run(String... args) throws Exception {
        ProductTableSeeder();
    }

    private void ProductTableSeeder() {
        if (this.productService.getProducts().isEmpty()) {

            for (int i=0; i < 15; i++) {
                Product product = new Product
                        (
                                faker.name().name(),
                                faker.app().toString(),
                                faker.number().randomNumber()
                        );
               this.productService.addProduct(product);
            }
        }
    }
}
