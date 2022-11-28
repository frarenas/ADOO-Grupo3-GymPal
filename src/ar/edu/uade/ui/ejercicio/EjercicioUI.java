package ar.edu.uade.ui.ejercicio;

import ar.edu.uade.controller.EjercicioController;
import ar.edu.uade.model.dto.EjercicioDTO;

import javax.swing.*;
import java.util.List;

public class EjercicioUI {
    public JPanel pnlPrincipal;
    private JTable tblEjercicios;

    public EjercicioUI(EjercicioController ejercicioController) {

        //Datos tabla
        List<EjercicioDTO> ejercicios = ejercicioController.getEjercicios();
        EjercicioTableModel ejercicioTableModel = new EjercicioTableModel(ejercicioController, ejercicios);
        tblEjercicios.setModel(ejercicioTableModel);

    }

}
