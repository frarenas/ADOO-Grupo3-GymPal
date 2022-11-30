package ar.edu.uade.model.objetivo;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;
import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.model.AdapterFirebase;
import ar.edu.uade.model.Notificacion;

public class ObjetivoBajarPeso extends Objetivo{
    private double pesoObjetivo;

    public boolean objetivoCumplido(){
        super.cumplido = super.adapterMedicion.obtenerPeso() == pesoObjetivo;
        return super.cumplido;
    }

    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.MEDIO, 3, 10, "Entre 1 y 1 hora y media");

    }

    public void sugerirObjetivo() {
        if(super.cumplido){
            IAdapterNotificacionPush not = new AdapterFirebase();
            Notificacion mensaje = new Notificacion();
            mensaje.setMensaje("Se sugiere Objetivo 'Mantener figura'");
            not.enviar(mensaje);
        }

    }

    ;



}
