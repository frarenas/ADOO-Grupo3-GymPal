package ar.edu.uade.model;

import java.util.List;

public class Socio {
	
	private String nombre;
	private int documento;
	private int edad;
	private String sexo;
	private String email;
	private Double altura;
	private Double peso;
	private Objetivo objetivo;
	private List<Medicion> mediciones;
	private List<Objetivo> historialObjetivos;
	//private AdapterMedicion adapterMedicion;
	//private List<Trofeo> trofeosGanados;
	
	public Socio(String nombre, int documento, int edad, String sexo, String email, Double altura, Double peso) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.edad = edad;
		this.sexo = sexo;
		this.email = email;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void elegirObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
	
	public void actualizarPeso(Double peso) {
		this.peso = peso;
	}

}
