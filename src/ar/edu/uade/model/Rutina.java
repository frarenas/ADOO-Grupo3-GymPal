package ar.edu.uade.model;

import ar.edu.uade.enums.ExigenciaMuscular;

import java.util.LinkedList;
import java.util.List;

public class Rutina {

	private int semanaDeEntrenamiento = 0;
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
		for (int i = semanaDeEntrenamiento; i < 5; i++){
			Entrenamiento entrenamientoReforzado = this.entrenamientos.get(i);
			entrenamientoReforzado.reforzar();
			entrenamientos.set(semanaDeEntrenamiento, entrenamientoReforzado);
		}
	}
	public void simularSemana(){
		if (semanaDeEntrenamiento <4)
			semanaDeEntrenamiento++;
	}
	public boolean rutinaCompleta(){
		return semanaDeEntrenamiento == 4;
	}
	public Entrenamiento getEntrenamientos(int semana){
		return this.entrenamientos.get(semana);
	}
	public List<Entrenamiento> getEntrenamientos(){
		return this.entrenamientos;
	}
	public int getSemanaDeEntrenamiento() { return semanaDeEntrenamiento; }

}
