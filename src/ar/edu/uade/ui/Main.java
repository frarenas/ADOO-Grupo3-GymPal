package ar.edu.uade.ui;

import ar.edu.uade.controller.SocioController;
import ar.edu.uade.enums.SexoBiologico;
import ar.edu.uade.model.socio.Socio;

public class Main {

	public static void main(String[] args) {
		init();
		new Menu();
	}

	private static void init() {
		Socio socio1 = new Socio(0L, "Jose", "12345678", 25, SexoBiologico.MASCULINO, "jose@example.com", 1.7, 70);
		Socio socio2 = new Socio(1L, "Federico", "12341234", 30, SexoBiologico.MASCULINO, "federico@example.com", 1.8, 80);
		Socio socio3 = new Socio(2L, "Francisco", "12344321", 35, SexoBiologico.MASCULINO, "francisco@example.com", 1.9, 90);

		SocioController.socioDB.put(socio1.getId(), socio1);
		SocioController.socioDB.put(socio2.getId(), socio2);
		SocioController.socioDB.put(socio3.getId(), socio3);
	}
}
