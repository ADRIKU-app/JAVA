package com.krakedev;

public class Calculadora {
	
	public double sumar (int a, int b) {
		
		double resultado;
		resultado = a + b;
		
		return resultado;
		
	}
	
	public double restar (int a, int b) {
		
		double resultado;
		resultado = a - b;
		
		return resultado;
		
	}
	
	public double multiplicar (int a, int b) {
		double resultado;
		resultado = a * b;
		
		return resultado;
		
	}
	
	public double dividir (int a, int b) {
		double resultado;
		resultado = a / b;
		
		return resultado;
	}
	
	public double promediar (int a, int b, int c) {
		double resultado;
		resultado = (a + b + c)/3;
		
		return resultado;
	}
	
	public void mostrarResultado() {
		
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}

}
