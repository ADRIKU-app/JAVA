package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		rest1.nombre = "La Cocina de Consuelo";
		rest1.direccion = "Centro de la ciudad";
		rest1.calificacion = 5;
		
		System.out.println("=====Restaurante 1: Creado=====");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Dirección: " + rest1.direccion);
		System.out.println("Calificación: " + rest1.calificacion);
		
		Restaurante rest2 = new Restaurante();

		rest2.nombre = "Pescados de COCO";
		rest2.direccion = "Los Pambiles";
		rest2.calificacion = 5;
		
		System.out.println("=====Restaurante 2: Creado=====");
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Dirección: " + rest2.direccion);
		System.out.println("Calificación: " + rest2.calificacion);

	}

}
