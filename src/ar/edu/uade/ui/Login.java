package ar.edu.uade.ui;

import ar.edu.uade.controller.SocioController;
import ar.edu.uade.model.ResultadoOperacion;

import javax.swing.*;
import java.awt.*;

public class Login extends JDialog {
    private JPanel pnlPrincipal;
    private JTextField txtUsuario;
    private JTextField txtContrasena;
    private JButton btnLogin;

    private final Login self;

    public Login(Window owner, String titulo) {
        super(owner, titulo);

        self = this;

        pnlPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        this.setContentPane(pnlPrincipal);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(owner);
        getRootPane().setDefaultButton(btnLogin);

        setModal(true);

        setActions();
    }

    private void setActions() {
        btnLogin.addActionListener(e -> {
            if(!validar()){
                return;
            }

            String usuario = txtUsuario.getText();
            String contrasena = txtContrasena.getText();

            SocioController socioController = SocioController.getInstance();
            ResultadoOperacion resultadoOperacion = socioController.login(usuario, contrasena);

            if(resultadoOperacion.isExito()) {
                self.dispose();
            }else {
                JOptionPane.showMessageDialog(null, resultadoOperacion.getMensaje());
            }
        });
    }

    private boolean validar() {
        if(txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el usuario.");
            return false;
        }
        if(txtContrasena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la contraseña.");
            return false;
        }
        return true;
    }

}
