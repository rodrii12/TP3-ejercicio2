package tp3_sanasana;

public class Paciente extends Persona{
    private String grupoSanguineo;
    
    public Paciente() {
    }

    public Paciente(String grupoSanguineo, String apellido, String nombre, Integer documento, String sexo, String direccion, Integer telefono, String correo) {
        super(apellido, nombre, documento, sexo, direccion, telefono, correo);
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
    
}
