package ar.edu.uade.model;

import ar.edu.uade.abstractions.IAdapterMedicion;
import ar.edu.uade.abstractions.IObservable;
import ar.edu.uade.abstractions.IObserver;
import ar.edu.uade.enums.SexoBiologico;
import ar.edu.uade.model.servicios.ServicioMedicionExt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medicion implements IObservable {
	
	private IAdapterMedicion adapterMedicion;
	private Date fecha;
	private double altura;
	private double peso;
	private List<IObserver> observers = new ArrayList<>();
	
	public Medicion(double altura, double peso) {
		new Medicion(new Date(), altura, peso);
	}

	public Medicion(Date fecha, double altura, double peso) {
		this.fecha = fecha;
		this.altura = altura;
		this.peso = peso;

		adapterMedicion = new ServicioMedicionExt();

		//calcular peso ideal. adapterMedicion.obtenerPesoIdeal(altura, sexo, edad)
		if(peso <= 70) {
			notificar();
		}
	}

	public Date getFecha(){return fecha;}
	public double getAltura(){return altura;}
	public double getPeso(){return peso;}

	@Override
	public void agregar(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void eliminar(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notificar() {
		for (IObserver observer: observers) {
			observer.notificar();
		}
	}
}
