package ar.edu.uade.model;

import ar.edu.uade.model.ejercicio.Ejercicio;

import java.util.List;

public class Entrenamiento {
	
	private List<Ejercicio> ejercicios;
	private double duracion;

	public Entrenamiento(List<Ejercicio> ejercicios, Double duracion) {
		this.ejercicios = ejercicios;
		this.duracion = duracion;
	}

	public void crearEntrenamiento(){
		throw new UnsupportedOperationException();
	}
	public void reforzar(){
		throw new UnsupportedOperationException();
	}

}
