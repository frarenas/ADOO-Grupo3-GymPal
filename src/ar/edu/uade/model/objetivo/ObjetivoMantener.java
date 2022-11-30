package ar.edu.uade.model.objetivo;

import ar.edu.uade.enums.ExigenciaMuscular;

public class ObjetivoMantener extends Objetivo{

    private double pesoObjetivo;
    private Integer NUnidades = 3;

    @Override
    public boolean objetivoCumplido() {
        super.cumplido = (adapterMedicion.obtenerPeso() >= pesoObjetivo - this.NUnidades) &&
                (adapterMedicion.obtenerPeso()  <= pesoObjetivo+ this.NUnidades);
        return super.cumplido;

    }

    @Override
    public void crearRutina() {
        super.getRutina().crearRutina(ExigenciaMuscular.BAJO, 2, 4, "Entre 45 min. a 1 hora y 20");
    }

    @Override
    public void sugerirObjetivo() {

    }
}
