package ar.edu.uade.model.objetivo;

import ar.edu.uade.model.NotificacionPush;
import ar.edu.uade.model.Rutina;

public class ObjetivoTonificar extends Objetivo{

    private Double grasaCorporalIdeal;
    private Double masaMuscularIdeal;


    @Override
    public boolean objetivoCumplido() {
        return false;
    }

    @Override
    public Rutina crearRutina() {
        return null;
    }

    @Override
    public NotificacionPush sugerirObjetivo() {
        return null;
    }
}
