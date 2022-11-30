package ar.edu.uade.model.objetivo;

import ar.edu.uade.abstractions.IAdapterNotificacionPush;
import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.model.AdapterFirebase;
import ar.edu.uade.model.Notificacion;

public class ObjetivoTonificar extends Objetivo{

    private double grasaCorporalIdeal;
    private double masaMuscularIdeal;


    @Override
    public boolean objetivoCumplido() {
        super.cumplido = adapterMedicion.obtenerGrasa() == grasaCorporalIdeal && masaMuscularIdeal == adapterMedicion.obtenerMusculo();
        return super.cumplido;
    }

    @Override
    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.ALTO, 1, 4,"Entre 2 horas y 2 horas y media");
    }

    @Override
    public void sugerirObjetivo() {
        if(super.cumplido){
            IAdapterNotificacionPush not = new AdapterFirebase();
            Notificacion mensaje = new Notificacion();
            mensaje.setMensaje("Se sugiere Objetivo 'Mantener figura'");
            not.enviar(mensaje);
        }

    }
}
