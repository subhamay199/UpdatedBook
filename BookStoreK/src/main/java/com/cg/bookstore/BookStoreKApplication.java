package com.cg.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages= {"com.cg.bookstore"})
@EntityScan(basePackages="com.cg.bookstore.beans")
@EnableJpaRepositories(basePackages="com.cg.bookstore.daoservices")
@EnableWebMvc
public class BookStoreKApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreKApplication.class, args);
	}

}
