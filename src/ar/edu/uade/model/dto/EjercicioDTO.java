package ar.edu.uade.model.dto;

import ar.edu.uade.model.ExigenciaMuscular;
import ar.edu.uade.model.GrupoMuscular;
import ar.edu.uade.model.ejercicio.Ejercicio;

import java.util.List;
import java.util.stream.Collectors;

public class EjercicioDTO {

	private Long id;
	private String nombre;
	private GrupoMuscular grupoMuscular;
	private int series;
	private int repeticiones;
	private double carga;
	private int nivelAerobico;
	private ExigenciaMuscular exigenciaMuscular;
	private String urlVideoMuestra;
	private double refuerzo;

	public EjercicioDTO(Long id, String nombre, GrupoMuscular grupoMuscular, int series, int repeticiones, double carga, int nivelAerobico, ExigenciaMuscular exigenciaMuscular, String urlVideoMuestra, double refuerzo) {
		this.id = id;
		this.nombre = nombre;
		this.grupoMuscular = grupoMuscular;
		this.series = series;
		this.repeticiones = repeticiones;
		this.carga = carga;
		this.nivelAerobico = nivelAerobico;
		this.exigenciaMuscular = exigenciaMuscular;
		this.urlVideoMuestra = urlVideoMuestra;
		this.refuerzo = refuerzo;
	}

	//GETTERS & SETTERS


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public static EjercicioDTO fromEntity(Ejercicio ejercicio) {
		return new EjercicioDTO(
				ejercicio.getId(),
				ejercicio.getNombre(),
				ejercicio.getGrupoMuscular(),
				ejercicio.getSeries(),
				ejercicio.getRepeticiones(),
				ejercicio.getCarga(),
				ejercicio.getNivelAerobico(),
				ejercicio.getExigenciaMuscular(),
				ejercicio.getUrlVideoMuestra(),
				ejercicio.getRefuerzo()
		);
	}

	public static List<EjercicioDTO> fromEntities(List<Ejercicio> ejercicios) {
		return ejercicios.stream().map(EjercicioDTO::fromEntity).collect(Collectors.toList());
	}
}
