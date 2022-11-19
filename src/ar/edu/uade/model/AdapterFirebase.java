package ar.edu.uade.model;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;

public class AdapterFirebase implements IAdapterNotificacionPush {
	
	public void enviar(Notificacion notificacion) {
		System.out.println("Notificacion enviada");
	}

}
