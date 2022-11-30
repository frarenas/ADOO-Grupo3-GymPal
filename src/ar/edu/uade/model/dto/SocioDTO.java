package ar.edu.uade.model.dto;

import ar.edu.uade.enums.SexoBiologico;
import ar.edu.uade.model.Medicion;
import ar.edu.uade.model.socio.Socio;

import java.util.List;
import java.util.stream.Collectors;

public class SocioDTO {
    private Long id;
    private String nombre;
    private String documento;
    private int edad;
    private SexoBiologico sexo;
    private String email;
    private List<Medicion> mediciones;

    public SocioDTO(Long id, String nombre, String documento, int edad, SexoBiologico sexo, String email, List<Medicion> mediciones) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.sexo = sexo;
        this.email = email;
        this.mediciones = mediciones;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
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

    public List<Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(List<Medicion> mediciones) {
        this.mediciones = mediciones;
    }

    public static SocioDTO fromEntity(Socio socio) {
        return new SocioDTO(
                socio.getId(),
                socio.getNombre(),
                socio.getDocumento(),
                socio.getEdad(),
                socio.getSexo(),
                socio.getEmail(),
                socio.getMediciones()
        );
    }

    public static List<SocioDTO> fromEntities(List<Socio> socios) {
        return socios.stream().map(SocioDTO::fromEntity).collect(Collectors.toList());
    }
}
