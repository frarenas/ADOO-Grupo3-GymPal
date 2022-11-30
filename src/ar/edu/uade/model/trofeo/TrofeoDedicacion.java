package ar.edu.uade.model.trofeo;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;
import ar.edu.uade.model.AdapterFirebase;
import ar.edu.uade.model.Notificacion;
import ar.edu.uade.model.objetivo.Objetivo;
import ar.edu.uade.model.socio.Socio;

public class TrofeoDedicacion extends Trofeo {

    private Objetivo ojetivoObservado;


    @Override
    public void generarTrofeo(Socio socio) {
        IAdapterNotificacionPush not = new AdapterFirebase();
        Notificacion mensaje = new Notificacion();
        mensaje.setMensaje("Has ganado el Trofeo Dedicación");
        not.enviar(mensaje);
        socio.addTrofeo(this);
    }


}
