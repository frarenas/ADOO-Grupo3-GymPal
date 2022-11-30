package ar.edu.uade.model.objetivo;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.model.NotificacionPush;

public class ObjetivoTonificar extends Objetivo{

    private double grasaCorporalIdeal;
    private double masaMuscularIdeal;


    @Override
    public boolean objetivoCumplido() {
        super.cumplido = adapterMedicion.obtenerGrasa() == grasaCorporalIdeal && masaMuscularIdeal == adapterMedicion.obtenerMusculo();
        return super.cumplido;
    }

    @Override
    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.ALTO, 1, 4,"Entre 2 horas y 2 horas y media");
    }

    @Override
    public NotificacionPush sugerirObjetivo() {
        return null;
    }
}
