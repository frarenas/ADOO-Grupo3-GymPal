package ar.edu.uade.ui.usuario;

import ar.edu.uade.controller.SocioController;
import ar.edu.uade.model.dto.SocioDTO;
import ar.edu.uade.model.objetivo.Objetivo;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class EditarSocioUI {
    private JTextField txtEdad;
    private JTextField txtAltura;
    private JTextField txtPeso;
    private JComboBox<Objetivo> txtObjetivo;

    private JButton btnGuardar;
    public JPanel pnlPrincipal;

    private SocioDTO socioGuardado = null;

    public EditarSocioUI(SocioController socioController, SocioDTO socioDTO) {

        //loadObjetivos();

        completarFormulario(socioDTO);

        btnGuardar.addActionListener(e -> {
            guardarUsuario();
        });
    }

    private void completarFormulario(SocioDTO socio) {
        txtEdad.setText(String.valueOf(socio.getEdad()));
        txtAltura.setText(String.valueOf(socio.getAltura()));
        txtPeso.setText(String.valueOf(socio.getPeso()));
        //txtObjetivo.setSelectedItem(socio.getOb());
    }

    private void guardarUsuario() {
        try {

            if (txtEdad.getText().trim().isEmpty() ||
                    txtAltura.getText().isEmpty() ||
                    txtPeso.getText().isEmpty() ||
                    txtAltura.getText().isEmpty()
            ) {

                showMessageDialog(null, "Debe completar todos los campos para continuar");

            }
        } catch (Exception e) {
            e.printStackTrace();
            showMessageDialog(null, "Error al guardar el usuario -> " + e.getMessage());
        }
    }
}
