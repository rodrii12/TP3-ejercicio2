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
    
    
    
}
