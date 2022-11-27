package ar.edu.uade.model.servicios;

import ar.edu.uade.abstractions.IAdapterMedicion;
import ar.edu.uade.enums.SexoBiologico;

public class ServicioMedicionExt implements IAdapterMedicion {
	
	public double obtenerGrasaCorporal(final double peso, final double altura, final SexoBiologico sexoBiologico, final int edad) {
		return peso / (altura * 100);
	}
	
	public double obtenerMasaMuscular(final double peso, final double altura, final SexoBiologico sexoBiologico, final int edad) {
		return (peso / (altura * 100)) * 2;
	}
}
