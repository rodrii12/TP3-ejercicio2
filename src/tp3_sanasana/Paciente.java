package tp3_sanasana;

import java.time.format.DateTimeFormatter;

public class Paciente extends Persona{
    private String grupoSanguineo;
    private HistoriaClinica hc1;
    
    public Paciente() {
    }

    public Paciente(String grupoSanguineo, String apellido, String nombre, Integer documento, String sexo, String direccion, Integer telefono, String correo) {
        super(apellido, nombre, documento, sexo, direccion, telefono, correo);
        this.grupoSanguineo = grupoSanguineo;
    }


    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public Paciente(HistoriaClinica hc1) {
        this.hc1 = hc1;
    }

    public HistoriaClinica getHc1() {
        return hc1;
    }

    public void setHc1(HistoriaClinica hc1) {
        this.hc1 = hc1;
    }

    public DateTimeFormatter getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(DateTimeFormatter fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    

    
}
