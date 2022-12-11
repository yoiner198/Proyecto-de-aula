package modelo.entidades;

public class Cita  implements IMetodo{
    
    private String ref;
    private Paciente paciente;
    private Medico medicoEncargado;
    private String motivoConsulta;

    public Cita(){}
    
    public Cita(String ref, Paciente paciente, Medico medicoEncargado, 
            String motivoConsulta) {
        
        this.ref = ref;
        this.paciente = paciente;
        this.medicoEncargado = medicoEncargado;
        this.motivoConsulta = motivoConsulta;
    }

    public String getRef() {return ref;}
    public void setRef(String ref) {this.ref = ref;}
    
    public Paciente getPaciente() {return paciente;}
    public void setPaciente(Paciente paciente) {this.paciente = paciente;}

    public Medico getMedicoEncargado() {return medicoEncargado;}
    public void setMedicoEncargado(Medico medicoEncargado) {this.medicoEncargado = medicoEncargado;}

    public String getMotivoConsulta() {return motivoConsulta;}
    public void setMotivoConsulta(String motivoConsulta) {this.motivoConsulta = motivoConsulta;}

    @Override
    public String toString() {
        return "Cita{" + "paciente=" + paciente + ", medicoEncargado=" + medicoEncargado + 
                ", motivpConsulta=" + motivoConsulta + '}';
    }

    @Override
    public String getDataStringFormat() {
        return "C;" + this.ref + ";" + this.paciente.cedula + ";" 
                + medicoEncargado.cedula + ";" 
                + this.motivoConsulta;
    }
}
