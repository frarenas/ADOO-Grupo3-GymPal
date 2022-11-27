package ar.edu.uade.abstractions;

import ar.edu.uade.enums.SexoBiologico;

public interface IAdapterMedicion {
	
	public double obtenerGrasaCorporal(final double peso, final double altura, final SexoBiologico sexoBiologico, final int edad);
	
	public double obtenerMasaMuscular(final double peso, final double altura, final SexoBiologico sexoBiologico, final int edad);
}
