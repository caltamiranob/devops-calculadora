package io.caltamirano.calculadora.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.caltamirano.calculadora.business.Operacion.Tipo;

@SpringBootTest
public class OperacionBusinessTest {

	@Test
	public void testCalcularSumar_15_y_5() {
		
		Tipo tipo = Tipo.SUMAR;
		int numeroUno = 15;
		int numeroDos = 5;
		int resultadoEsperado = 20;
		int resultadoObtenido = Operacion.calcular(tipo, numeroUno, numeroDos);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
}
