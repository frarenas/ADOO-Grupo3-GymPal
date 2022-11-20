package ar.edu.uade.model.socio;


import ar.edu.uade.abstractions.IAdapterMedicion;
import ar.edu.uade.dto.SocioDTO;
import ar.edu.uade.model.Medicion;
import ar.edu.uade.model.Objetivo;
import ar.edu.uade.model.Trofeo;

import java.util.List;

public class Socio {

	private String nombre;
	private int documento;
	private int edad;
	private SexoBiologico sexo;
	private String email;
	private Double altura;
	private Double peso;
	private Objetivo objetivo = null;
	private List<Medicion> mediciones = null;
	private List<Objetivo> historialObjetivos = null;
	private IAdapterMedicion adapterMedicion = null;
	private List<Trofeo> trofeosGanados = null;

	public void registrarSocio(SocioDTO socio) {
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
	}

	public void actualizarPeso(Double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public SexoBiologico getSexo() {
		return sexo;
	}

	public void setSexo(SexoBiologico sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	//Siento que este metodo es redundante (ver elegirObjetivo())
	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
	public List<Medicion> getMediciones() {
		return mediciones;
	}
}
