package xyz.bnayagrawal.simplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("xyz.bnayagrawal.simplespringbootapp.repository")
@EntityScan("xyz.bnayagrawal.simplespringbootapp.model")
@SpringBootApplication
public class SimpleSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootAppApplication.class, args);
	}

}
