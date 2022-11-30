package ar.edu.uade.ui;

import ar.edu.uade.controller.EjercicioController;
import ar.edu.uade.controller.RutinaController;
import ar.edu.uade.controller.SocioController;
import ar.edu.uade.enums.Objetivo;
import ar.edu.uade.enums.SexoBiologico;
import ar.edu.uade.model.ejercicio.Ejercicio;
import ar.edu.uade.model.ejercicio.TotalEjercicios;
import ar.edu.uade.model.objetivo.ObjetivoBajarPeso;
import ar.edu.uade.model.objetivo.ObjetivoMantener;
import ar.edu.uade.model.objetivo.ObjetivoTonificar;
import ar.edu.uade.model.socio.Socio;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		init();
		new Menu();
	}

	private static void init() {
		Socio socio1 = new Socio(0L, "Jose", "12345678", 25, SexoBiologico.MASCULINO, "jose@example.com", 1.7, 70);
		Socio socio2 = new Socio(1L, "Federico", "12341234", 30, SexoBiologico.MASCULINO, "federico@example.com", 1.8, 80);
		Socio socio3 = new Socio(2L, "Francisco", "12344321", 35, SexoBiologico.MASCULINO, "francisco@example.com", 1.9, 90);

		ObjetivoMantener objetivoSocio1 = new ObjetivoMantener();
		ObjetivoTonificar objetivoSocio2 = new ObjetivoTonificar();
		ObjetivoBajarPeso objetivoSocio3 = new ObjetivoBajarPeso();

		socio1.elegirObjetivo(objetivoSocio1);
		objetivoSocio1.crearRutina();
		socio2.elegirObjetivo(objetivoSocio2);
		objetivoSocio2.crearRutina();
		socio3.elegirObjetivo(objetivoSocio3);
		objetivoSocio3.crearRutina();







		//Mock de Objetos
		SocioController.socioDB.put(socio1.getId(), socio1);
		SocioController.socioDB.put(socio2.getId(), socio2);
		SocioController.socioDB.put(socio3.getId(), socio3);

		List<Ejercicio> ejercicioRepository = new TotalEjercicios().getTotalEjercicios();
		for(Ejercicio e:ejercicioRepository){
			EjercicioController.ejercicioDB.put(e.getId(),e);
		}


	}
}
