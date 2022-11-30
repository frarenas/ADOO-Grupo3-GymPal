package ar.edu.uade.model.objetivo;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.model.NotificacionPush;

public class ObjetivoBajarPeso extends Objetivo{
    private double pesoObjetivo;

    public boolean objetivoCumplido(){
        super.cumplido = super.adapterMedicion.obtenerPeso() == pesoObjetivo;
        return super.cumplido;
    }

    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.MEDIO, 3, 10, "Entre 1 y 1 hora y media");

    }

    public NotificacionPush sugerirObjetivo() {
        if(super.cumplido){

        }
        return null;
    }

    ;



}
