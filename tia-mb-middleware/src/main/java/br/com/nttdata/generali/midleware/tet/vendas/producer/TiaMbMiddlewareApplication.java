package br.com.nttdata.generali.midleware.tet.vendas.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TiaMbMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiaMbMiddlewareApplication.class, args);
	}

}
