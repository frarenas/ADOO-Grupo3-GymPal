package ar.edu.uade.controller;

import ar.edu.uade.model.Entrenamiento;
import ar.edu.uade.model.Rutina;
import ar.edu.uade.model.dto.EjercicioDTO;


import java.util.*;

public class RutinaController {
    public static Map<Long, Entrenamiento> entrenamientoDB = new HashMap<>();

    private static RutinaController instance;
    private Rutina rutina;
    private RutinaController(){}

    public static RutinaController getInstance(){
        if(instance == null) {
            instance = new RutinaController();
        }
        return instance;
    }
    public List<Entrenamiento> getEntrenamientos(){
        return new LinkedList<Entrenamiento>(entrenamientoDB.values());
    }
    public List<EjercicioDTO> getEjerciciosAtEntrenamiento(){
        return this.getEntrenamientos().get(this.rutina.getDuracionSemanas()).getEjercicios();
    }
    public void simularSemana(){
        this.rutina.simularSemana();
    }

    public void setRutina(Rutina rutina){
        this.rutina = rutina;
        long counter = 0;
        for(Entrenamiento e: rutina.getEntrenamientos()){
            entrenamientoDB.put(counter,e);
        }

    }

    public void reforzarEntrenamiento() {
        this.rutina.reforzar();
    }
}
