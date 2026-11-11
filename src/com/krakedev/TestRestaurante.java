package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		/*System.out.println("=====Restaurante 1: Creado=====");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Dirección: " + rest1.direccion);
		System.out.println("Calificación: " + rest1.calificacion);*/
		
		rest1.setNombre("La Cocina de Consuelo");
		rest1.setDireccion("Centro de la ciudad");
		rest1.setCalificacion(5);
		
		System.out.println("=====Restaurante 1: Valores asignados=====");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());
		
		Restaurante rest2 = new Restaurante();
		
		/*System.out.println("=====Restaurante 2: Creado=====");
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Dirección: " + rest2.direccion);
		System.out.println("Calificación: " + rest2.calificacion);*/

		rest2.setNombre("Pescados de Coco");
		rest2.setDireccion("Los Pambiles");
		rest2.setCalificacion(4.5);
		
		System.out.println("=====Restaurante 2: Valores asignados=====");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

	}

}
