package ar.edu.uade.ui.Rutina;

import ar.edu.uade.controller.SocioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntrenamientoUI {
    public JPanel pnlPrincipal;
    private JTable tblRutina;
    private JButton btnReforzar;
    private JButton btnSimularSemana;


    public EntrenamientoUI(SocioController socioController) {
        EntrenamientoTableModel entrenamientoTableModel = new EntrenamientoTableModel(socioController);
        tblRutina.setModel(entrenamientoTableModel);

        btnSimularSemana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socioController.simularSemana();
                EntrenamientoTableModel newEntrenamientoTableModel = new EntrenamientoTableModel(socioController);
                tblRutina.setModel(newEntrenamientoTableModel);
            }
        });

        btnReforzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socioController.reforzarEntrenamiento();
                EntrenamientoTableModel newEntrenamientoTableModel = new EntrenamientoTableModel(socioController);
                tblRutina.setModel(newEntrenamientoTableModel);
            }
        });
    }
}
