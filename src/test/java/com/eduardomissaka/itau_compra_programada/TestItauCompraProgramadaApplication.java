package com.eduardomissaka.itau_compra_programada;

import org.springframework.boot.SpringApplication;

public class TestItauCompraProgramadaApplication {

	public static void main(String[] args) {
		SpringApplication.from(ItauCompraProgramadaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
