package ar.edu.uade.model.trofeo;

import ar.edu.uade.model.socio.Socio;

public abstract class Trofeo {

    public void generarTrofeo(Socio socio) {
        socio.addTrofeo(this);
    }
}
