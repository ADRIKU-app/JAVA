package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		double r1;
		
		r1 = c1.sumar(3, 5);
		
		System.out.println("Resultado Suma: " + r1);
		
		int r2;
		
		r2 = c1.restar(5, 3);
		
		System.out.println("Resultado Resta: " + r2);
		
	}

}
