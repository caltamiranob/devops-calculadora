package io.caltamirano.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SumarTest {

	@Test
	public void testSumar1_y_1() {
		
		int numeroUno = 1;
		int numeroDos = 1;
		
		int resultadoEsperado = 2;
		int resultadoObtenido = Sumar.calcular(numeroUno, numeroDos);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testSumar3_y_3() {
		
		int numeroUno = 3;
		int numeroDos = 3;
		
		int resultadoEsperado = 6;
		int resultadoObtenido = Sumar.calcular(numeroUno, numeroDos);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testSumar10_y_2() {
		
		int numeroUno = 10;
		int numeroDos = 2;
		
		int resultadoEsperado = 12;
		int resultadoObtenido = Sumar.calcular(numeroUno, numeroDos);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
}
