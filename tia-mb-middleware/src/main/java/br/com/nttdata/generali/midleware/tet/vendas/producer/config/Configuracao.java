package br.com.nttdata.generali.midleware.tet.vendas.producer.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
