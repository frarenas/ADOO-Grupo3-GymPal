package ar.edu.uade.model;

public abstract class Objetivo {
	
	private int duracionSemanas = 4;
	private Rutina rutina;

	public abstract boolean objetivoCumplido();

	public abstract Rutina crearRutina();

	public abstract NotificacionPush sugerirObjetivo();
}
