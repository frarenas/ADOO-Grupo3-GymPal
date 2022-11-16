package model;

public interface IAdapterMedicion {
	
	public Double obtenerGrasaCorporal(final Double peso, final Double altura, final SexoBiologico sexoBiologico, final int edad);
	
	public Double obtenerMasaMuscular(final Double peso, final Double altura, final SexoBiologico sexoBiologico, final int edad);
}
