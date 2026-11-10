package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		
		r1.altura = 4;
		r1.base = 2;
		
		double resultadoPerimetro;
		
		resultadoPerimetro = r1.calcularPerimetro();
		
		System.out.println("Resultado Perímetro: " + resultadoPerimetro);
		
		Rectangulo r2 = new Rectangulo();
		
		r2.altura = 10;
		r2.base = 3;
		
		double resultadoPerimetro2;
		
		resultadoPerimetro2 = r2.calcularPerimetro();
		
		System.out.println("Resultado Perímetro: " + resultadoPerimetro2);

	}

}
