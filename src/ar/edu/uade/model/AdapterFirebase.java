package model;

public class AdapterFirebase implements IAdapterNotificacionPush {
	
	public void enviar(Notificacion notificacion) {
		System.out.println("Notificacion enviada");
	}

}
