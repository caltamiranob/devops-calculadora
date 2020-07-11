package io.caltamirano.calculadora.business;

import io.caltamirano.calculadora.service.Sumar;

public class Operacion {

	public enum Tipo { SUMAR, RESTAR, DIVIDIR, MULTIPLICAR }
	
	public static int calcular(Tipo tipo, int numeroUno, int numeroDos) {
		
		
		if( tipo == Tipo.SUMAR ) {
			return Sumar.calcular(numeroUno, numeroDos);
		}
		
		throw new IllegalArgumentException("El tipo de operación seleccionada no se encuentra implementado");
		
	}
	
	
}
