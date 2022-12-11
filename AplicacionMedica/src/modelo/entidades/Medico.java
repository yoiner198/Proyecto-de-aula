package modelo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona {

    private List<Paciente> pacientes = new ArrayList();
    private List<Cita> citas = new ArrayList();
    private boolean disponibilidad = true;

    public Medico() {
    }

    public Medico(String cedula, String[] nombres, String[] apellidos,
            List<Paciente> pacientes, List<Cita> citas, boolean disponibilidad) {

        super(cedula, nombres, apellidos);
        this.pacientes = pacientes;
        this.citas = citas;
        this.disponibilidad = disponibilidad;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Medico{" + super.toString() + ", pacientes=" + pacientes.size()
                + ", citas=" + citas.size() + ", disponibilidad=" + disponibilidad + '}';
    }

    @Override
    public String getDataStringFormat() {

        return "M;" + this.cedula + ";" + this.nombres[0] + ";"
                + this.nombres[1] + ";" + this.apellidos[0] + ";"
                + this.apellidos[1] + ";" + this.pacientes.size() + ";"
                + this.citas.size() + ";" + this.disponibilidad;
    }
}
