package ar.edu.uade.model.objetivo;

import ar.edu.uade.model.NotificacionPush;
import ar.edu.uade.model.Rutina;

public class ObjetivoBajarPeso extends Objetivo{
    private double pesoObjetivo;

    public boolean objetivoCumplido(){
        return true;
    }

    public Rutina crearRutina() {
        return null;
    }

    public NotificacionPush sugerirObjetivo() {
        return null;
    }

    ;



}
