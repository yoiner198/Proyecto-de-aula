package modelo.entidades;

public class Paciente extends Persona{
    private Cita cita;
    private Medico medico;
    
    public Paciente(){}

    public Paciente(String cedula, String[] nombres, String[] apellidos, 
            Cita cita, Medico medico, String userName, String password) {
        
        super(cedula, nombres, apellidos, userName, password);
        this.cita = cita;
        this.medico = medico;
    }

    public Cita getCita() {return cita;}
    public void setCita(Cita cita) {this.cita = cita;}

    public Medico getMedico() {return medico;}
    public void setMedico(Medico medico) {this.medico = medico;}

    @Override
    public String toString() {
        return "Paciente{" + super.toString()+ ", cita=" + cita + 
                ", medico=" + medico + ", userName=" + userName + ", password=" + password + '}';
    }
    
    @Override
    public String getDataStringFormat() {
        
        if(this.cita != null && this.medico != null){
         return "P;" + this.cedula + ";" + this.nombres[0] + ";" + 
                this.nombres[1] + ";" + this.apellidos[0] + ";" + 
                this.apellidos[1] + ";" + this.cita.getRef() + ";" + this.medico.cedula + 
                 ";" + this.userName + ";" + this.password;   
        }
        
        return "P;" + this.cedula + ";" + this.nombres[0] + ";" + 
                this.nombres[1] + ";" + this.apellidos[0] + ";" + 
                this.apellidos[1] + ";" + "null" + ";" + "null" + 
                 ";" + this.userName + ";" + this.password;
    }
}
