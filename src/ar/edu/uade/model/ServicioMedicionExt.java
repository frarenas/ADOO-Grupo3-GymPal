package model;

public class ServicioMedicionExt implements IAdapterMedicion {
	
	public Double obtenerGrasaCorporal(final Double peso, final Double altura, final SexoBiologico sexoBiologico, final int edad) {
		return peso / (altura * 100);
	}
	
	public Double obtenerMasaMuscular(final Double peso, final Double altura, final SexoBiologico sexoBiologico, final int edad) {
		return (peso / (altura * 100)) * 2;
	}
}
