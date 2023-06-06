package br.com.nttdata.generali.tiaasyncmiddleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TiaAsyncMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiaAsyncMiddlewareApplication.class, args);
	}

} 
