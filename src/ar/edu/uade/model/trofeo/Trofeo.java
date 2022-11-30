package ar.edu.uade.model.trofeo;

import ar.edu.uade.abstractions.IObserver;
import ar.edu.uade.controller.SocioController;
import ar.edu.uade.model.socio.Socio;

public abstract class Trofeo implements IObserver {

    public abstract void generarTrofeo(Socio socio);

    @Override
    public void notificar() {
        generarTrofeo(SocioController.socioLogueado);
    }
}
