package ar.edu.uade.model.objetivo;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.model.Medicion;
import ar.edu.uade.model.NotificacionPush;

public class ObjetivoBajarPeso extends Objetivo{
    private double pesoObjetivo;

    public boolean objetivoCumplido(Medicion medicion){
        return medicion.getPeso() == pesoObjetivo;
    }

    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.MEDIO, 3, 10, "Entre 1 y 1 hora y media");

    }

    public NotificacionPush sugerirObjetivo() {
        return null;
    }

    ;



}
