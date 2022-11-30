package ar.edu.uade.model;

import ar.edu.uade.enums.ExigenciaMuscular;

import java.util.LinkedList;
import java.util.List;

public class Rutina {

	private int duracionSemanas = 0;
	private List<Entrenamiento> entrenamientos = new LinkedList<>();

	public Rutina() {
		this.entrenamientos = entrenamientos;
	}

	public void crearRutina(ExigenciaMuscular nivelExigencia, int nivelAerobicoMin, int nivelAerobicoMax, String duracionEntrenamiento){

		for(int i =0; i<5; i++){
			Entrenamiento entrenamiento = new Entrenamiento();
			entrenamiento.crearEntrenamiento(nivelExigencia, nivelAerobicoMin, nivelAerobicoMax, duracionEntrenamiento);
			this.entrenamientos.add(entrenamiento);
		}
	}
	public void reforzar(){
		Entrenamiento entrenamientoReforzado = this.entrenamientos.get(duracionSemanas);
		entrenamientoReforzado.reforzar();
		entrenamientos.set(duracionSemanas, entrenamientoReforzado);
	}
	public void simularSemana(){
		if (duracionSemanas<4)
			duracionSemanas++;
	}
	public boolean rutinaCompleta(){
		return duracionSemanas == 4;
	}
	public Entrenamiento getEntrenamientos(int semana){
		return this.entrenamientos.get(semana);
	}
	public List<Entrenamiento> getEntrenamientos(){
		return this.entrenamientos;
	}
	public int getDuracionSemanas() { return duracionSemanas; }

}
