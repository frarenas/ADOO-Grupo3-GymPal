package ar.edu.uade.model.ejercicio;

import ar.edu.uade.model.ExigenciaMuscular;
import ar.edu.uade.model.GrupoMuscular;

public class EjercicioReforzado extends Ejercicio {
    private Ejercicio ejercicio;

    public EjercicioReforzado(Long id, String nombre, GrupoMuscular grupoMuscular, int series, int repeticiones, double carga, int nivelAerobico, ExigenciaMuscular exigenciaMuscular, String urlVideoMuestra, double refuerzo) {
        super(id, nombre, grupoMuscular, series, repeticiones, carga, nivelAerobico, exigenciaMuscular, urlVideoMuestra, refuerzo);
    }
}
