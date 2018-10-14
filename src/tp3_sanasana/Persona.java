package tp3_sanasana;

import java.time.format.DateTimeFormatter;


public class Persona {
    private String apellido;
    private String nombre;
    private Integer documento;
    private String sexo;
    private String direccion;
    private Integer telefono;
    private String correo;
    DateTimeFormatter fechanacimiento = DateTimeFormatter.ofPattern("d/MM/yyyy");
}
