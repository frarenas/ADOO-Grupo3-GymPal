package ar.edu.uade.abstractions;

import ar.edu.uade.enums.SexoBiologico;

public interface IAdapterMedicion {

	double obtenerPeso();
	double obtenerGrasa();
	double obtenerMusculo();
	double obtenerAltura();
	double obtenerPesoIdeal(double altura, SexoBiologico sexoBiologico, int edad);
	double obtenerGrasaIdeal(SexoBiologico sexoBiologico, int edad);
	
	double obtenerMasaMuscularIdeal(SexoBiologico sexoBiologico, int edad);

}
