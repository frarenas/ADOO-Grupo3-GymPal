package ar.edu.uade.model.objetivo;

import ar.edu.uade.model.NotificacionPush;
import ar.edu.uade.model.Rutina;

public abstract class Objetivo {
	
	private Rutina rutina;

	public abstract boolean objetivoCumplido();

	public abstract void crearRutina();

	public abstract NotificacionPush sugerirObjetivo();

	public Rutina getRutina() {
		return rutina;
	}
}
