package ar.edu.uade.model;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;

public class NotificacionPush {
	
	private IAdapterNotificacionPush adapterNotificacionPush;
	
	public NotificacionPush(IAdapterNotificacionPush adapterNotificacionPush) {
		this.adapterNotificacionPush = adapterNotificacionPush;
	}

	public void enviar(final Notificacion notificacion) {
		adapterNotificacionPush.enviar(notificacion);
	}

}
