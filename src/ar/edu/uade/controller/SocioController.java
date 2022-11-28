package ar.edu.uade.controller;

import ar.edu.uade.model.ResultadoOperacion;
import ar.edu.uade.model.dto.SocioDTO;
import ar.edu.uade.model.socio.Socio;

import java.util.*;

public class SocioController {

    public static Map<Long, Socio> socioDB = new HashMap<>();
    public static Socio socioLogueado;
    private static SocioController instance;

    private SocioController() {
    }

    public static SocioController getInstance() {
        if (instance == null) {
            instance = new SocioController();
        }
        return instance;
    }

    public ResultadoOperacion login(String usuario, String contrasena) {
        socioLogueado = socioDB.values().stream()
                .filter(x -> Objects.equals(x.getNombre().toLowerCase(), usuario.toLowerCase()) /*&& Objects.equals(x.getContrasena(), contrasena)*/)
                .findFirst().orElse(null);

        if (socioLogueado != null) {
            return new ResultadoOperacion(true, null);
        } else {
            return new ResultadoOperacion(false, "Usuario o contraseña incorrecta.");
        }
    }

    public void logout() {
        socioLogueado = null;
    }

    public void guardarSocio(SocioDTO socioDTO) {
        final Socio socio = new Socio(socioDTO);
        socioDB.put(socioDTO.getId(), socio);
        socioLogueado = socio;
    }
}
