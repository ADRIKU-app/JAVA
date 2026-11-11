package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
		/*System.out.println("=====PlatoA Creado=====");
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + (platoA.disponible ? "Sí" : "No"));*/
		
		platoA.setNombre("Coctel de camarón");
		platoA.setTipo("Entrada");
		platoA.setPrecio(4.5);
		platoA.setDisponible(true);
		
		System.out.println("=====PlatoA Valores asignados=====");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + (platoA.isDisponible() ? "Sí" : "No"));

		Plato platoB = new Plato();
		
		/*System.out.println("=====PlatoB Creado=====");
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + (platoB.disponible ? "Sí" : "No"));*/
		
		platoB.setNombre("Arroz Marinero");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(12.80);
		platoB.setDisponible(false);
		
		System.out.println("=====PlatoB Valores asignados=====");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + (platoB.isDisponible() ? "Sí" : "No"));
		
		Plato platoC = new Plato();
		
		/*System.out.println("=====PlatoC Creado=====");
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + (platoC.disponible ? "Sí" : "No"));*/
		
		platoC.setNombre("CheeseCake de maracuya");
		platoC.setTipo("Postre");
		platoC.setPrecio(3.5);
		platoC.setDisponible(true);
		
		System.out.println("=====PlatoC Valores asignados=====");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + (platoC.isDisponible() ? "Sí" : "No"));
		
		Plato platoD = new Plato("Ensalada de frutas", "postre", 2, true);
		
		System.out.println("=====PlatoD Valores asignados=====");
		System.out.println("Nombre: " + platoD.getNombre());
		System.out.println("Tipo: " + platoD.getTipo());
		System.out.println("Precio: " + platoD.getPrecio());
		System.out.println("Disponible: " + (platoD.isDisponible() ? "Sí" : "No"));

	}

}
