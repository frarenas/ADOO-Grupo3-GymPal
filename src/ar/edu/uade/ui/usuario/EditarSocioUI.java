package ar.edu.uade.ui.usuario;

import ar.edu.uade.controller.SocioController;
import ar.edu.uade.model.dto.SocioDTO;

import javax.swing.*;

import static ar.edu.uade.enums.Objetivo.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class EditarSocioUI {
    private JTextField txtEdad;
    private JTextField txtAltura;
    private JTextField txtPeso;
    private JComboBox<String> cbObjetivo;

    private JButton btnGuardar;
    public JPanel pnlPrincipal;

    private SocioDTO socioGuardado = null;

    private final SocioController socioController;

    public EditarSocioUI(SocioController socioController, SocioDTO socioDTO) {

        this.socioController = socioController;
        this.socioGuardado = socioDTO;

        loadObjetivos();

        completarFormulario(socioDTO);

        btnGuardar.addActionListener(e -> {
            guardarUsuario();
        });
    }

    private void completarFormulario(SocioDTO socio) {
        txtEdad.setText(String.valueOf(socio.getEdad()));
        txtAltura.setText(String.valueOf(socio.getAltura()));
        txtPeso.setText(String.valueOf(socio.getPeso()));
    }

    private void guardarUsuario() {
        try {

            if (txtEdad.getText().trim().isEmpty() ||
                    txtAltura.getText().isEmpty() ||
                    txtPeso.getText().isEmpty()
            ) {

                showMessageDialog(null, "Debe completar todos los campos para continuar");

            } else {
                socioGuardado.edad = Integer.parseInt(txtEdad.getText());
                socioGuardado.altura = Double.parseDouble(txtAltura.getText());
                socioGuardado.peso = Double.parseDouble(txtPeso.getText());

                socioController.guardarSocio(socioGuardado);
            }
        } catch (Exception e) {
            e.printStackTrace();
            showMessageDialog(null, "Error al guardar el usuario -> " + e.getMessage());
        }
    }

    private void loadObjetivos() {
        cbObjetivo.addItem(BAJARPESO.toString());
        cbObjetivo.addItem(TONIFICAR.toString());
        cbObjetivo.addItem(MANTENER.toString());
    }
}
