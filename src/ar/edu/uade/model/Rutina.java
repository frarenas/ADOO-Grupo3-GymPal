package ar.edu.uade.model;

import ar.edu.uade.enums.ExigenciaMuscular;

import java.util.LinkedList;
import java.util.List;

public class Rutina {

	//private final int duracionSemanas = 4;
	private List<Entrenamiento> entrenamientos = new LinkedList<Entrenamiento>();

	public Rutina(List<Entrenamiento> entrenamientos) {
		this.entrenamientos = entrenamientos;
	}

	public Rutina crearRutina(ExigenciaMuscular nivelExigencia, int nivelAerobicoMin, int nivelAerobicoMax){

		for(int i =0; i<5; i++){
			Entrenamiento entrenamiento = new Entrenamiento();
			entrenamiento.crearEntrenamiento(nivelExigencia, nivelAerobicoMin, nivelAerobicoMax);
			this.entrenamientos.add(entrenamiento);
		}
		return this;

	}
	public void reforzar(){
		Entrenamiento entrenamientoReforzado = this.entrenamientos.get(entrenamientos.size()-1);
		entrenamientoReforzado.reforzar();
		entrenamientos.set(entrenamientos.size() - 1, entrenamientoReforzado);
	}
	public boolean rutinaCompleta(){
		throw new UnsupportedOperationException();
	}

}
