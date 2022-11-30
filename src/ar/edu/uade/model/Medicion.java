package ar.edu.uade.model;

import ar.edu.uade.abstractions.IAdapterMedicion;

import java.util.Date;

public class Medicion {
	
	private IAdapterMedicion adapterMedicion;
	private Date fecha;
	private double altura;
	private double peso;
	
	public Medicion(double altura, double peso) {
		new Medicion(new Date(), altura, peso);
	}

	public Medicion(Date fecha, double altura, double peso) {
		this.fecha = fecha;
		this.altura = altura;
		this.peso = peso;
	}

	public Date getFecha(){return fecha;}
	public double getAltura(){return altura;}
	public double getPeso(){return peso;}

}
