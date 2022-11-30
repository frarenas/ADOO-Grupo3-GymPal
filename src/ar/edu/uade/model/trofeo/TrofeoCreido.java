package ar.edu.uade.model.trofeo;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;
import ar.edu.uade.model.AdapterFirebase;
import ar.edu.uade.model.Notificacion;
import ar.edu.uade.model.socio.Socio;

public class TrofeoCreido extends Trofeo{

    private Socio socioObservado;


    @Override
    public void generarTrofeo(Socio socio) {
        IAdapterNotificacionPush not = new AdapterFirebase();
        Notificacion mensaje = new Notificacion();
        mensaje.setMensaje("Has ganado el Trofeo al Creido");
        not.enviar(mensaje);
        socio.addTrofeo(this);
    }


}
