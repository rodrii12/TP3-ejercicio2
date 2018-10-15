package tp3_sanasana;

import java.time.format.DateTimeFormatter;


public abstract class Persona {
    private String apellido;
    private String nombre;
    private Integer documento;
    private String sexo;
    private String direccion;
    private Integer telefono;
    private String correo;
    DateTimeFormatter fechanacimiento = DateTimeFormatter.ofPattern("d/MM/yyyy");

    public Persona(){
        
    }
    
    public Persona(String apellido, String nombre, Integer documento, String sexo, String direccion, Integer telefono, String correo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public DateTimeFormatter getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(DateTimeFormatter fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    
    
}
