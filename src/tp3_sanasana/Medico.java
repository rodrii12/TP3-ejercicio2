
package tp3_sanasana;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Franco
 */
public class Medico extends Persona {
    private String especialidad;
    private Double sueldoBase;
    DateTimeFormatter fechaingreso = DateTimeFormatter.ofPattern("d/MM/yyyy");
    DateTimeFormatter fechabaja = DateTimeFormatter.ofPattern("d/MM/yyyy");

    
}
