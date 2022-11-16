package ar.edu.uade.model;

public class AdapterFirebase implements IAdapterNotificacionPush {
	
	public void enviar(Notificacion notificacion) {
		System.out.println("Notificacion enviada");
	}

}
