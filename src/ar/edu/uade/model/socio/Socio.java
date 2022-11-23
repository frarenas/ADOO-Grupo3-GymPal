package ar.edu.uade.model.socio;


import ar.edu.uade.abstractions.IAdapterMedicion;
import ar.edu.uade.model.Medicion;
import ar.edu.uade.model.objetivo.Objetivo;
import ar.edu.uade.model.servicios.ServicioMedicionExt;
import ar.edu.uade.model.trofeo.Trofeo;
import ar.edu.uade.socioDTO.SocioDTO;

import java.util.List;

public class Socio {

	private String nombre;
	private int documento;
	private int edad;
	private SexoBiologico sexo;
	private String email;
	private double altura;
	private double peso;
	private Objetivo objetivo = null;
	private List<Medicion> mediciones = null;
	private List<Objetivo> historialObjetivos = null;
	private IAdapterMedicion adapterMedicion = new ServicioMedicionExt();
	private List<Trofeo> trofeosGanados = null;

	//RegistrarSocio()
	public Socio(SocioDTO socio){
		this.nombre = socio.nombre;
		this.documento = socio.documento;
		this.edad = socio.edad;
		this.sexo = socio.sexo;
		this.email = socio.email;
		this.altura = socio.altura;
		this.peso = socio.peso;
	}
	public void elegirObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
		historialObjetivos.add(objetivo);
	}

	public void actualizarPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDocumento() {
		return documento;
	}
	public int getEdad() {
		return edad;
	}
	public SexoBiologico getSexo() {
		return sexo;
	}
	public String getEmail() {
		return email;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public Objetivo getObjetivo() {
		return objetivo;
	}
	public List<Medicion> getMediciones() {
		return mediciones;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

