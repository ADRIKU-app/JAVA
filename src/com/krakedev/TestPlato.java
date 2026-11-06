package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
		platoA.nombre = "Ceviche";
		platoA.tipo = "Plato fuerte";
		platoA.precio = 8.5;
		platoA.disponible = true;
		
		System.out.println("=====PlatoA Creado=====");
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);

	}

}
