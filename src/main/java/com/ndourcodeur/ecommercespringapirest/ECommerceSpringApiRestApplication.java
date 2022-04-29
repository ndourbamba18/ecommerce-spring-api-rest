package com.ndourcodeur.ecommercespringapirest;

import com.ndourcodeur.ecommercespringapirest.entities.Product;
import com.ndourcodeur.ecommercespringapirest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author NdourCodeur
 **/

@SpringBootApplication
@EnableAsync
public class ECommerceSpringApiRestApplication {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceSpringApiRestApplication.class, args);

		System.out.println("Server is running....");
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product("Hp", "Laptop", 258.45));
			productRepository.save(new Product("Mac Pro", "Laptop", 400.00));
			productRepository.save(new Product("Iphone X", "Mobile", 550.00));
			productRepository.save(new Product("SamSung S21", "Mobile", 350.00));
			productRepository.save(new Product("SamSung A10", "Mobile", 300.00));
			productRepository.save(new Product("Acer ", "Laptop", 450.45));
			productRepository.save(new Product("Lenovo", "Laptop", 258.45));
			productRepository.save(new Product("Dell", "Laptop", 258.45));
			productRepository.save(new Product("Hp Medium", "Laptop", 258.45));
			productRepository.save(new Product("Hp Small", "Laptop", 258.45));
		};
	}

}
