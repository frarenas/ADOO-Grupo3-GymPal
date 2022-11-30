package ar.edu.uade.ui.Entrenamiento;

import ar.edu.uade.controller.SocioController;
import ar.edu.uade.model.Entrenamiento;
import ar.edu.uade.model.dto.EjercicioDTO;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EntrenamientoTableModel extends AbstractTableModel {


    public EntrenamientoTableModel(SocioController socioController) {
        this.entrenamiento = socioController.getEntrenamiento();
    }
    private final Entrenamiento entrenamiento;

    protected String[] columnNames = new String[]{"Nombre", "Grupo", "Series", "Repeticiones", "Carga"};
    protected Class[] columnClasses = new Class[]{String.class, String.class, String.class, String.class, String.class};


    public String getColumName(int col) { return columnNames[col]; }
    public Class getColumnClass(int col) { return columnClasses[col]; }

    @Override
    public int getRowCount() { return entrenamiento.getEjercicios().size(); }

    @Override
    public int getColumnCount() { return columnNames.length; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<EjercicioDTO> ejercicios = entrenamiento.getEjercicios();
        switch (columnIndex){
            case 0:
                return ejercicios.get(rowIndex).getNombre();
            case 1:
                return ejercicios.get(rowIndex).getGrupoMuscular();
            case 2:
                return ejercicios.get(rowIndex).getSeries();
            case 3:
                return ejercicios.get(rowIndex).getRepeticiones();
            case 4:
                return ejercicios.get(rowIndex).getCarga();
            default:
                return null;
        }
    }
}
