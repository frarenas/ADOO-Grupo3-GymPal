package ar.edu.uade.model.objetivo;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.model.NotificacionPush;
import ar.edu.uade.model.Rutina;

public class ObjetivoMantener extends Objetivo{

    private double pesoActual;
    private Integer NUnidades;

    @Override
    public boolean objetivoCumplido() {
        return false;
    }

    @Override
    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.BAJO, 2, 4);
    }

    @Override
    public NotificacionPush sugerirObjetivo() {
        return null;
    }
}
