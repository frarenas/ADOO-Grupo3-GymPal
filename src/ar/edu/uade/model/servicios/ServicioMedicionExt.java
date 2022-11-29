package ar.edu.uade.model.servicios;

import ar.edu.uade.abstractions.IAdapterMedicion;
import ar.edu.uade.enums.SexoBiologico;

public class ServicioMedicionExt implements IAdapterMedicion {

	@Override
	public double obtenerPeso() {
		return 0;
	}

	@Override
	public double obtenerGrasa() {
		return 0;
	}

	@Override
	public double obtenerMusculo() {
		return 0;
	}

	@Override
	public double obtenerAltura() {
		return 0;
	}

	//Altura debe ser expresada en metros
	@Override
	public double obtenerPesoIdeal(double altura, SexoBiologico sexoBiologico, int edad) {
		if (sexoBiologico==SexoBiologico.MASCULINO) {
			return 22 * (altura * 2);
		} else return 22 * (altura - 0.1) * 2;
	}

	//Devuelve un double menor a 1 correspondiente al porcentaje ideal de Grasa Corporal
	@Override
	public double obtenerGrasaIdeal(SexoBiologico sexoBiologico, int edad) {
		if (sexoBiologico==SexoBiologico.MASCULINO){
			if (edad <= 29) return 0.13;
			else if (edad <= 39) return 0.14;
			else if (edad <= 49) return 0.16;
			else return 0.17;
		}
		else {
			if (edad <= 29) return 0.19;
			else if (edad <= 39) return 0.20;
			else if (edad <= 49) return 0.21;
			else return 0.22;
		}
	}

	//Devuelve un double menor a 1 correspondiente al porcentaje ideal de Masa Muscular
	@Override
	public double obtenerMasaMuscularIdeal(SexoBiologico sexoBiologico, int edad) {
		if (sexoBiologico==SexoBiologico.MASCULINO){
			if (edad <= 39) return 0.80;
			else if (edad <= 59) return 0.75;
			else return 0.70;
		}
		else {
			if (edad <= 39) return 0.70;
			else if (edad <= 59) return 0.65;
			else return 0.60;
		}
	}
}
