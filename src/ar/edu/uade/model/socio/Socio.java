package ar.edu.uade.model.socio;


import ar.edu.uade.abstractions.IAdapterMedicion;
import ar.edu.uade.enums.SexoBiologico;
import ar.edu.uade.model.Medicion;
import ar.edu.uade.model.objetivo.Objetivo;
import ar.edu.uade.model.servicios.ServicioMedicionExt;
import ar.edu.uade.model.trofeo.Trofeo;
import ar.edu.uade.model.dto.SocioDTO;

import java.util.LinkedList;
import java.util.List;

public class Socio {
	private Long id;
	private String nombre;
	private String documento;
	private int edad;
	private SexoBiologico sexo;
	private String email;
	private Objetivo objetivo = null;
	private List<Medicion> mediciones = null;
	private List<Objetivo> historialObjetivos = new LinkedList<Objetivo>();
	private IAdapterMedicion adapterMedicion = new ServicioMedicionExt();
	private List<Trofeo> trofeosGanados = new LinkedList<>();

	public Socio(Long id, String nombre, String documento, int edad, SexoBiologico sexo, String email, List<Medicion> mediciones) {
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
		this.edad = edad;
		this.sexo = sexo;
		this.email = email;
		this.mediciones = mediciones;
	}

	//RegistrarSocio()
	public Socio(SocioDTO socio){
		this.id = socio.getId();
		this.nombre = socio.getNombre();
		this.documento = socio.getDocumento();
		this.edad = socio.getEdad();
		this.sexo = socio.getSexo();
		this.email = socio.getEmail();
		this.mediciones = socio.getMediciones();
	}
	public void elegirObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
		historialObjetivos.add(objetivo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public String getDocumento() {
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
	public Objetivo getObjetivo() {
		return objetivo;
	}
	public List<Medicion> getMediciones() {
		return mediciones;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void addTrofeo(Trofeo trofeo){
		this.trofeosGanados.add(trofeo);
	}
}

