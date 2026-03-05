package com.eduardomissaka.itau_compra_programada;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ItauCompraProgramadaApplicationTests {

	@Test
	void contextLoads() {
	}

}
