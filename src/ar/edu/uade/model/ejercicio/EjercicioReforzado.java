package ar.edu.uade.model.ejercicio;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.enums.GrupoMuscular;

public class EjercicioReforzado extends Ejercicio {
    private Ejercicio ejercicio;

    public EjercicioReforzado(Long id, String nombre, GrupoMuscular grupoMuscular, int series, int repeticiones, double carga, int nivelAerobico, ExigenciaMuscular exigenciaMuscular, String urlVideoMuestra) {
        super(id, nombre, grupoMuscular, series, repeticiones, carga, nivelAerobico, exigenciaMuscular, urlVideoMuestra);
    }

    public void reforzarEjercicio(){
        double carga = this.getCarga() + 5;
        this.setCarga(carga);
        int reps = this.getRepeticiones() +3;
        this.setRepeticiones(reps);
        int series = this.getSeries() +1;
        this.setSeries(series);
    }
}
