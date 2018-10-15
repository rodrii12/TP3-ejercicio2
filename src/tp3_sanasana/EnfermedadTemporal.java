package tp3_sanasana;

import java.time.format.DateTimeFormatter;

public class EnfermedadTemporal extends Enfermedad{
    DateTimeFormatter fechaDeteccion= DateTimeFormatter.ofPattern("d/MM/yyyy");
    DateTimeFormatter fechaCuracion= DateTimeFormatter.ofPattern("d/MM/yyyy");
    
    public EnfermedadTemporal(String tipo) {
        super(tipo);
    }

    public EnfermedadTemporal(DateTimeFormatter fechaDeteccion, DateTimeFormatter fechaCuracion, String tipo) {
        super(tipo);
        this.fechaDeteccion = fechaDeteccion;
        this.fechaCuracion = fechaCuracion;
    }

    public DateTimeFormatter getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(DateTimeFormatter fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public DateTimeFormatter getFechaCuracion() {
        return fechaCuracion;
    }

    public void setFechaCuracion(DateTimeFormatter fechaCuracion) {
        this.fechaCuracion = fechaCuracion;
    }
    
    
}
