package ar.edu.uade.ui;

import ar.edu.uade.controller.*;
import ar.edu.uade.model.dto.SocioDTO;
import ar.edu.uade.ui.Entrenamiento.EntrenamientoUI;
import ar.edu.uade.ui.ejercicio.EjercicioUI;
import ar.edu.uade.ui.socio.EditarSocioUI;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Menu {

    JFrame rootFrame;
    private JPanel pnlPrincipal;

    private JMenuItem mnuEjercicio;
    private JMenuItem mnuSocio;
    private JMenuItem mnuEntrenamiento;
    private JMenuItem mnuObjetivo;

    public Menu() {
        rootFrame = new JFrame("GymPal");
        JMenuBar mb = setMenu();

        rootFrame.setJMenuBar(mb);
        rootFrame.setSize(800, 600);
        rootFrame.setLayout(null);
        rootFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rootFrame.setLocationRelativeTo(null);
        //rootFrame.add(pnlPrincipal);

        rootFrame.setVisible(true);

        login();
    }

    private JMenuBar setMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu mnuMenu = new JMenu("Menu");
        mnuSocio = new JMenuItem("Socio");
        mnuEjercicio = new JMenuItem("Ejercicios");
        mnuEntrenamiento = new JMenuItem("Entrenamiento");
        mnuObjetivo = new JMenuItem("Objetivo");

        mnuSocio.addActionListener(e -> mostrarPantalla(new EditarSocioUI(SocioController.getInstance(), SocioDTO.fromEntity(SocioController.socioLogueado)).pnlPrincipal));
        mnuEjercicio.addActionListener(e -> mostrarPantalla(new EjercicioUI(EjercicioController.getInstance()).pnlPrincipal));
        mnuEntrenamiento.addActionListener(e -> mostrarPantalla(new EntrenamientoUI(SocioController.getInstance()).pnlPrincipal));
        mnuObjetivo.addActionListener(e -> mostrarPantalla(new ObjetivoUI(SocioController.getInstance()).pnlPrincipal));

        mnuMenu.add(mnuSocio);
        mnuMenu.add(mnuEjercicio);
        mnuMenu.add(mnuEntrenamiento);
        mnuMenu.add(mnuObjetivo);

        mb.add(mnuMenu);

        JMenuItem mnuLogout = new JMenuItem("Cerrar sesión");
        mnuLogout.addActionListener(e -> login());
        mb.add(mnuLogout);

        return mb;
    }

    private void mostrarPantalla(JPanel panel) {
        rootFrame.setContentPane(panel);
        rootFrame.setVisible(true);
    }

    private void login() {
        mostrarPantalla(pnlPrincipal);
        rootFrame.setVisible(true);
        SocioController.getInstance().logout();

        Login login = new Login(this.rootFrame, "Login");
        login.setVisible(true);
        login.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                mnuSocio.setVisible(true);
                mnuEjercicio.setVisible(true);
            }
        });
    }
}
