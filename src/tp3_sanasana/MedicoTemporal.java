package tp3_sanasana;

public abstract class MedicoTemporal extends Medico implements Contrato{

    public MedicoTemporal(String especialidad, Double sueldoBase) {
        super(especialidad, sueldoBase);
    }

    
    @Override
    public void horasTrabajadas(){
    }
}
