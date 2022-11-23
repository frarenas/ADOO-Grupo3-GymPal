package ar.edu.uade.model.objetivo;

import ar.edu.uade.model.NotificacionPush;
import ar.edu.uade.model.Rutina;

public abstract class Objetivo {
	
	private int duracionSemanas = 4;
	private Rutina rutina;

	public abstract boolean objetivoCumplido();

	public abstract Rutina crearRutina();

	public abstract NotificacionPush sugerirObjetivo();
}
