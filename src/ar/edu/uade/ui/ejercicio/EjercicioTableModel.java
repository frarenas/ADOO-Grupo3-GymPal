package ar.edu.uade.ui.ejercicio;

import ar.edu.uade.controller.EjercicioController;
import ar.edu.uade.model.dto.EjercicioDTO;

import javax.swing.table.AbstractTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class EjercicioTableModel extends AbstractTableModel {

    private final EjercicioController ejercicioController;

    private final List<EjercicioDTO> ejercicios;
    protected String[] columnNames = new String[]{"Nombre", "Grupo",};
    protected Class[] columnClasses = new Class[] { String.class, String.class};

    public EjercicioTableModel(EjercicioController ejercicioController, List<EjercicioDTO> ejercicios) {
        this.ejercicioController = ejercicioController;
        this.ejercicios = ejercicios;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Class getColumnClass(int col) {
        return columnClasses[col];
    }

    @Override
    public int getRowCount() {
        return ejercicios.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ejercicios.get(rowIndex).getNombre();
            case 1:
                return ejercicios.get(rowIndex).getGrupoMuscular();
            default:
                return null;
        }
    }
}
