package ar.edu.uade.model.objetivo;

import ar.edu.uade.abstractions.IAdapterMedicion;
import ar.edu.uade.abstractions.IObserver;
import ar.edu.uade.model.Rutina;
import ar.edu.uade.model.servicios.ServicioMedicionExt;

public abstract class Objetivo implements IObserver {
	
	private Rutina rutina = new Rutina();
	boolean cumplido;
	IAdapterMedicion adapterMedicion = new ServicioMedicionExt();

	public abstract boolean objetivoCumplido();

	public abstract void crearRutina();

	public abstract void sugerirObjetivo();

	public Rutina getRutina() {
		return rutina;
	}

	public boolean isCumplido() {
		return cumplido;
	}

	@Override
	public void notificar() {
		sugerirObjetivo();
	}
}
