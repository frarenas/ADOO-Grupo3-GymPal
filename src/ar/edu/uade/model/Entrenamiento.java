package ar.edu.uade.model;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.enums.GrupoMuscular;
import ar.edu.uade.model.dto.EjercicioDTO;
import ar.edu.uade.model.ejercicio.Ejercicio;
import ar.edu.uade.model.ejercicio.TotalEjercicios;

import java.util.LinkedList;
import java.util.List;

public class Entrenamiento {
	
	private List<Ejercicio> ejercicios = new LinkedList<>();
	private String duracion;

	public Entrenamiento() {
	}

	public List<EjercicioDTO> getEjercicios() {
		return EjercicioDTO.fromEntities(ejercicios);
	}

	public Entrenamiento crearEntrenamiento(ExigenciaMuscular nivelExigencia, int nivelAerobicoMin, int nivelAerobicoMax,
											String duracion){

		TotalEjercicios totalEjercicios = new TotalEjercicios();
		totalEjercicios.cargarEjercicios();

		//por cada grupo muscular agrega un ejercicio. el entrenamiento estará compuesto de 5 ejercicios
		for(GrupoMuscular musculo : GrupoMuscular.values()){
			for(int i =0; i<totalEjercicios.getTotalEjercicios().size(); i++){
				Ejercicio ej = totalEjercicios.getTotalEjercicios().get(i);
				if(ej.getGrupoMuscular() == musculo){
					if (nivelExigencia == ej.getExigenciaMuscular()){
						if (ej.getNivelAerobico() >= nivelAerobicoMin && ej.getNivelAerobico() <= nivelAerobicoMax){
							this.ejercicios.add(ej);
							break;

						}
					}
				}
			}
		}
		this.duracion = duracion;
		return this;

	}
	//Para cada ejercicio del Entrenamiento se aumenta la carga en 2,5 o 5kg dependiendo el grupo muscular
	public void reforzar(){
		for (Ejercicio e:ejercicios){
			if(e.getGrupoMuscular().equals(GrupoMuscular.BRAZOS) || e.getGrupoMuscular().equals(GrupoMuscular.HOMBROS))
				e.setCarga(e.getCarga()+2.5);
			else e.setCarga(e.getCarga()+5);
		}
	}

	public String getDuracion() {
		return duracion;
	}
}
