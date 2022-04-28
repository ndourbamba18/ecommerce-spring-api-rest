package com.ndourcodeur.ecommercespringapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author NdourCodeur
 **/

@SpringBootApplication
@EnableAsync
public class ECommerceSpringApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceSpringApiRestApplication.class, args);

		System.out.println("Server is running....");
	}

}
