package io.caltamirano.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestarTest {

	@Test
	public void testRestar5_y_3() {
		
		int numeroUno = 5;
		int numeroDos = 3;
		
		int resultadoEsperado = 2;
		int resultadoObtenido = Restar.calcular(numeroUno, numeroDos);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testRestar8_y_3() {
		
		int numeroUno = 8;
		int numeroDos = 3;
		
		int resultadoEsperado = 5;
		int resultadoObtenido = Restar.calcular(numeroUno, numeroDos);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	
}
