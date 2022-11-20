package ar.edu.uade.model;

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
