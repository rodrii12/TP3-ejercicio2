package tp3_sanasana;

import java.time.format.DateTimeFormatter;


public class Medico extends Persona {
    private String especialidad;
    private Double sueldoBase;
    DateTimeFormatter fechaingreso = DateTimeFormatter.ofPattern("d/MM/yyyy");
    DateTimeFormatter fechabaja = DateTimeFormatter.ofPattern("d/MM/yyyy");

    public Medico(String especialidad, Double sueldoBase) {
        this.especialidad = especialidad;
        this.sueldoBase = sueldoBase;
    }

    public Medico(String apellido, String nombre, Integer documento, String sexo, String direccion, Integer telefono, String correo) {
        super(apellido, nombre, documento, sexo, direccion, telefono, correo);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public DateTimeFormatter getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(DateTimeFormatter fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public DateTimeFormatter getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(DateTimeFormatter fechabaja) {
        this.fechabaja = fechabaja;
    }

    
    
}
