package com.krakedev;

public class Rectangulo {
	
	public double base;
	public double altura;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		
		double perimetro = 2*base + 2*altura;
		return perimetro;
	}
}
