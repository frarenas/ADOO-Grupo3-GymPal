package ar.edu.uade.model.objetivo;

import ar.edu.uade.model.NotificacionPush;
import ar.edu.uade.model.Rutina;

public class ObjetivoMantener extends Objetivo{

    private Double pesoActual;
    private Integer NUnidades;

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
