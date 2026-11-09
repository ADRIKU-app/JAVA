package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		double r1;
		
		r1 = c1.sumar(3, 5);
		
		System.out.println("Resultado Suma: " + r1);
		
		double r2;
		
		r2 = c1.restar(5, 3);
		
		System.out.println("Resultado Resta: " + r2);
		
		double r3;
		
		r3 = c1.multiplicar(10, 2);
		
		System.out.println("Resultado Multiplicación: " + r3);
		
		double r4;
		
		r4 = c1.dividir(10, 2);
		
		System.out.println("Resultado División: " + r4);
		
	}

}
