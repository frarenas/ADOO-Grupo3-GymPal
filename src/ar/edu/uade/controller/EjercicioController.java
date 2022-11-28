package ar.edu.uade.controller;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.enums.GrupoMuscular;
import ar.edu.uade.model.dto.*;
import ar.edu.uade.model.ejercicio.Ejercicio;

import java.util.*;

public class EjercicioController {

    public static Map<Long, Ejercicio> ejercicioDB = new HashMap<>();
    private static EjercicioController instance;

    private EjercicioController() {
    }

    public static EjercicioController getInstance() {
        if (instance == null) {
            instance = new EjercicioController();
        }
        return instance;
    }

    public EjercicioDTO altaEjercicio(
            Long id,
            String nombre,
            GrupoMuscular grupoMuscular,
            int series,
            int repeticiones,
            double carga,
            int nivelAerobico,
            ExigenciaMuscular exigenciaMuscular,
            String urlVideoMuestra,
            double refuerzo
    ) {
        Ejercicio ejercicio = new Ejercicio(
                id,
                nombre,
                grupoMuscular,
                series,
                repeticiones,
                carga,
                nivelAerobico,
                exigenciaMuscular,
                urlVideoMuestra,
                refuerzo
        );
        ejercicioDB.put(id, ejercicio);
        return EjercicioDTO.fromEntity(ejercicio);
    }

    public EjercicioDTO altaEjercicio(
            EjercicioDTO ejercicioDTO
    ) {
        return altaEjercicio(
                ejercicioDTO.getId(),
                ejercicioDTO.getNombre(),
                ejercicioDTO.getGrupoMuscular(),
                ejercicioDTO.getSeries(),
                ejercicioDTO.getRepeticiones(),
                ejercicioDTO.getCarga(),
                ejercicioDTO.getNivelAerobico(),
                ejercicioDTO.getExigenciaMuscular(),
                ejercicioDTO.getUrlVideoMuestra(),
                ejercicioDTO.getRefuerzo()
        );
    }

    public void modificarEjercicio(
            Long id,
            String nombre,
            GrupoMuscular grupoMuscular,
            int series,
            int repeticiones,
            double carga,
            int nivelAerobico,
            ExigenciaMuscular exigenciaMuscular,
            String urlVideoMuestra,
            double refuerzo
    ) {
        Ejercicio ejercicio = ejercicioDB.get(id);
        ejercicio.setNombre(nombre);
        ejercicio.setGrupoMuscular(grupoMuscular);
        ejercicio.setSeries(series);
        ejercicio.setRepeticiones(repeticiones);
        ejercicio.setCarga(carga);
        ejercicio.setNivelAerobico(nivelAerobico);
        ejercicio.setExigenciaMuscular(exigenciaMuscular);
        ejercicio.setUrlVideoMuestra(urlVideoMuestra);
        ejercicio.setRefuerzo(refuerzo);

        ejercicioDB.put(id, ejercicio);
    }

    public void modificarEjercicio(
            EjercicioDTO ejercicioDTO
    ) {
        modificarEjercicio(
                ejercicioDTO.getId(),
                ejercicioDTO.getNombre(),
                ejercicioDTO.getGrupoMuscular(),
                ejercicioDTO.getSeries(),
                ejercicioDTO.getRepeticiones(),
                ejercicioDTO.getCarga(),
                ejercicioDTO.getNivelAerobico(),
                ejercicioDTO.getExigenciaMuscular(),
                ejercicioDTO.getUrlVideoMuestra(),
                ejercicioDTO.getRefuerzo()
        );
    }

    public void bajaEjercicio(
            Long id
    ) {
        ejercicioDB.remove(id);
    }

    public List<EjercicioDTO> getEjercicios() {
        return EjercicioDTO.fromEntities(new ArrayList<>(ejercicioDB.values()));
    }
}
