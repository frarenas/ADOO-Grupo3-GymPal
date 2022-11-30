package ar.edu.uade.ui.Rutina;

import ar.edu.uade.controller.RutinaController;
import ar.edu.uade.model.dto.EjercicioDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RutinaUI {
    public JPanel pnlPrincipal;
    private JTable tblRutina;
    private JButton btnReforzar;
    private JButton btnSimularSemana;


    public RutinaUI(RutinaController rutinaController) {
        List<EjercicioDTO> ejercicios = rutinaController.getEjerciciosAtEntrenamiento();
        RutinaTableModel rutinaTableModel = new RutinaTableModel(rutinaController);
        tblRutina.setModel(rutinaTableModel);

        btnSimularSemana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rutinaController.simularSemana();
            }
        });

        btnReforzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rutinaController.reforzarEntrenamiento();
            }
        });
    }
}
