package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado();
		
		c1.lado = 4;
		
		double resultadoArea;
		
		resultadoArea = c1.calcularArea();
		
		System.out.println("Reulstado Área: " + resultadoArea);
		
		
		Cuadrado c2 = new Cuadrado();
		
		c2.lado = 3;
		
		double resultadoPerimetroCuadrado;
		
		resultadoPerimetroCuadrado = c2.calcularPerimetro();
		
		System.out.println("Resultado Perímetro: " + resultadoPerimetroCuadrado);
		
		
		Cuadrado c3 = new Cuadrado();
		
		c3.lado = 6;
		
		double resultadoArea2;
		
		resultadoArea2 = c3.calcularArea();
		
		System.out.println("Resultado Área 2: " + resultadoArea2);

	}

}
