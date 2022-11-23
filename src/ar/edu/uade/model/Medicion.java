package ar.edu.uade.model;

import ar.edu.uade.abstractions.IAdapterMedicion;

import java.util.Date;

public class Medicion {
	
	private IAdapterMedicion adapterMedicion;
	private Date fecha;
	private double altura;
	private double peso;
	
	public Medicion(double altura, double peso) {
		this.fecha = new Date();
		this.altura = altura;
		this.peso = peso;
	}
	
	public void obtenerGrasaCorporal() {
		adapterMedicion.obtenerGrasaCorporal(peso, altura, null, 0);
	}
	
	public void obtenerMasaMuscular() {
		adapterMedicion.obtenerMasaMuscular(peso, altura, null, 0);
	}

}
