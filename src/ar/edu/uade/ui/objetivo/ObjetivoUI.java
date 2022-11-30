package ar.edu.uade.ui.objetivo;

import ar.edu.uade.controller.SocioController;
import ar.edu.uade.model.objetivo.Objetivo;
import ar.edu.uade.model.objetivo.ObjetivoBajarPeso;
import ar.edu.uade.model.objetivo.ObjetivoMantener;
import ar.edu.uade.model.objetivo.ObjetivoTonificar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjetivoUI {
    private JComboBox comboBoxObjetivo;
    private JButton btnElegirObjetivo;
    public JPanel pnlPrincipal;

    public ObjetivoUI(SocioController socioController) {
        btnElegirObjetivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Objetivo objetivo;
                switch (comboBoxObjetivo.getSelectedObjects()[0].toString()){
                    case "Bajar de Peso":
                        objetivo = new ObjetivoBajarPeso();
                    case "Mantener figura":
                        objetivo = new ObjetivoMantener();
                    case "Tonificar":
                        objetivo = new ObjetivoTonificar();
                    default:
                        objetivo = SocioController.socioLogueado.getObjetivo();
                }
                SocioController.socioLogueado.elegirObjetivo(objetivo);
                SocioController.socioLogueado.getObjetivo().crearRutina();
            }
        });
    }
}
