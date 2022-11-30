package ar.edu.uade.model.objetivo;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.model.Medicion;
import ar.edu.uade.model.NotificacionPush;

public class ObjetivoMantener extends Objetivo{

    private double pesoActual;
    private Integer NUnidades;

    @Override
    public boolean objetivoCumplido(Medicion medicion) {
        return false;
    }

    @Override
    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.BAJO, 2, 4, "Entre 45 min. a 1 hora y 20");
    }

    @Override
    public NotificacionPush sugerirObjetivo() {
        return null;
    }
}
