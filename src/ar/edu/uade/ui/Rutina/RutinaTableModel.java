package ar.edu.uade.ui.Rutina;

import ar.edu.uade.controller.RutinaController;
import ar.edu.uade.enums.GrupoMuscular;
import ar.edu.uade.model.Entrenamiento;
import ar.edu.uade.model.dto.EjercicioDTO;
import ar.edu.uade.model.ejercicio.Ejercicio;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class RutinaTableModel extends AbstractTableModel {


    public RutinaTableModel(RutinaController rutinaController) {
        this.rutinaController = rutinaController;
        this.entrenamientos = rutinaController.getEntrenamientos();
    }
    private final RutinaController rutinaController;
    private final List<Entrenamiento> entrenamientos;

    protected String[] columnNames = new String[]{"Nombre", "Grupo", "Series", "Repeticiones", "Carga"};
    protected Class[] columnClasses = new Class[]{String.class, String.class, String.class, String.class, String.class};


    public String getColumName(int col) { return columnNames[col]; }
    public Class getColumnClass(int col) { return columnClasses[col]; }

    @Override
    public int getRowCount() { return entrenamientos.size(); }

    @Override
    public int getColumnCount() { return columnNames.length; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<EjercicioDTO> ejerciciosDeEstaSemana = rutinaController.getEjerciciosAtEntrenamiento();
        switch (columnIndex){
            case 0:
                return ejerciciosDeEstaSemana.get(rowIndex).getNombre();
            case 1:
                return ejerciciosDeEstaSemana.get(rowIndex).getGrupoMuscular();
            case 2:
                return ejerciciosDeEstaSemana.get(rowIndex).getSeries();
            case 3:
                return ejerciciosDeEstaSemana.get(rowIndex).getRepeticiones();
            case 4:
                return ejerciciosDeEstaSemana.get(rowIndex).getCarga();
            default:
                return null;
        }
    }
}
