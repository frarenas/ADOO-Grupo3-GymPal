package ar.edu.uade.model;

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
