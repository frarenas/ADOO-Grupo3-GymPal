package ar.edu.uade.model.trofeo;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;
import ar.edu.uade.model.AdapterFirebase;
import ar.edu.uade.model.Notificacion;
import ar.edu.uade.model.Rutina;
import ar.edu.uade.model.socio.Socio;

public class TrofeoConstancia extends Trofeo {

    private Rutina rutinaObservado;

    @Override
    public void generarTrofeo(Socio socio) {
        IAdapterNotificacionPush not = new AdapterFirebase();
        Notificacion mensaje = new Notificacion();
        mensaje.setMensaje("Has ganado el Trofeo Constancia");
        not.enviar(mensaje);
        socio.addTrofeo(this);

    }


}
