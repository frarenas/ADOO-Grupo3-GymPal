package ar.edu.uade.model;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;

import javax.swing.*;

public class AdapterFirebase implements IAdapterNotificacionPush {
	
	public void enviar(Notificacion notificacion) {

		JOptionPane.showMessageDialog(null, notificacion.getMensaje());
	}

}
