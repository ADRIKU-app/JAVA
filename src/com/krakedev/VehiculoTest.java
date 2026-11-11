package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Vehiculo();
		
		/*System.out.println("====Vehículo 1: Creado====");
		
		System.out.println("Año: " + v.anio);
		System.out.println("Marca: " + v.marca);
		System.out.println("Modelo: " + v.modelo);*/
		
		System.out.println("====Vehículo 1: Valores Asignados====");
		
		v.setAnio("2026");
		v.setMarca("Chevrolet");
		v.setModelo("Spark GT");
		v.setPrecio(16000);
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		System.out.println("Precio: " + v.getPrecio());
		
		Vehiculo v2 = new Vehiculo();

		//System.out.println("====Vehículo 2: Creado====");
				
		/*System.out.println("Año: " + v2.anio);
		System.out.println("Marca: " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);*/
		
		System.out.println("====Vehículo 2: Valores Asignados====");
		
		v2.setAnio("2025");
		v2.setMarca("Toyota");
		v2.setModelo("Hilux");
		v2.setPrecio(60000);
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		System.out.println("Precio: " + v2.getPrecio());
		
		System.out.println("====Vehículo 3: Valores Asignados====");
		
		Vehiculo v3 = new Vehiculo("Toyota");
		
		System.out.println("Año: " + v3.getAnio());
		System.out.println("Marca: " + v3.getMarca());
		System.out.println("Modelo: " + v3.getModelo());
		System.out.println("Precio: " + v3.getPrecio());
		
		System.out.println("====Vehículo 4: Valores Asignados====");
		
		Vehiculo v4 = new Vehiculo("Kia", "Sportage", "2012", 16000);
		
		System.out.println("Año: " + v4.getAnio());
		System.out.println("Marca: " + v4.getMarca());
		System.out.println("Modelo: " + v4.getModelo());
		System.out.println("Precio: " + v4.getPrecio());
		
	}

}
