package io.caltamirano.calculadora.business;

import io.caltamirano.calculadora.service.Sumar;

public class Operacion {

	public enum Tipo { SUMAR, RESTAR, DIVIDIR, MULTIPLICAR }
	
	public static int calcular(Tipo tipo, int numeroUno, int numeroDos) {
		
		switch (tipo) {
			case SUMAR:
				return Sumar.calcular(numeroUno, numeroDos);
	
			default:
				throw new RuntimeException("Método no se encuentra implementado");
		}
		
	}
	
	
}
