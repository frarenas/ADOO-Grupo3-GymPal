package ar.edu.uade.model.ejercicio;

import ar.edu.uade.model.ExigenciaMuscular;
import ar.edu.uade.model.GrupoMuscular;

public class Ejercicio {
	
	private String nombre;
	private GrupoMuscular grupoMuscular;
	private int series;
	private int repeticiones;
	private double carga;
	private int nivelAerobico;
	private ExigenciaMuscular exigenciaMuscular;
	private String urlVideoMuestra;
	private double refuerzo;

	//GETTERS & SETTERS


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(Double carga) {
		this.carga = carga;
	}

	public int getNivelAerobico() {
		return nivelAerobico;
	}

	public void setNivelAerobico(int nivelAerobico) {
		this.nivelAerobico = nivelAerobico;
	}

	public ExigenciaMuscular getExigenciaMuscular() {
		return exigenciaMuscular;
	}

	public void setExigenciaMuscular(ExigenciaMuscular exigenciaMuscular) {
		this.exigenciaMuscular = exigenciaMuscular;
	}

	public String getUrlVideoMuestra() {
		return urlVideoMuestra;
	}

	public void setUrlVideoMuestra(String urlVideoMuestra) {
		this.urlVideoMuestra = urlVideoMuestra;
	}

	public double getRefuerzo() {
		return refuerzo;
	}

	public void setRefuerzo(Double refuerzo) {
		this.refuerzo = refuerzo;
	}
}
