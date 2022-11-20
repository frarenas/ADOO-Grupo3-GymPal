package ar.edu.uade.model;

public class ObjetivoBajarPeso extends Objetivo{
    private Double pesoObjetivo;

    public boolean objetivoCumplido(){
        return true;
    }

    @Override
    public Rutina crearRutina() {
        return null;
    }

    @Override
    public NotificacionPush sugerirObjetivo() {
        return null;
    }

    ;



}
