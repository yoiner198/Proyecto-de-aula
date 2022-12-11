package modelo.entidades;

import java.util.List;

public class Admin extends Persona{
    
    private List<Paciente> listaPacientes;
    private List<Medico> listaMedicos;
    
    public Admin(){}

    public Admin(String cedula, String[] nombres, String[] apellidos, String userName, String password, List<Paciente> listaPacientes, List<Medico> listaMedicos) {
        super(cedula, nombres, apellidos, userName, password);
        this.listaPacientes = listaPacientes;
        this.listaMedicos = listaMedicos;
    }
    
    public Admin(String userName, String password, List<Paciente> listaPacientes, List<Medico> listaMedicos){
        this.userName = userName;
        this.password = password;
        this.listaPacientes = listaPacientes;
        this.listaMedicos = listaMedicos;
    }
    
    public List<Paciente> getListaPacientes() {return listaPacientes;}
    public void setListaPacientes(List<Paciente> listaPacientes) {this.listaPacientes = listaPacientes;}

    public List<Medico> getListaMedicos() {return listaMedicos;}
    public void setListaMedicos(List<Medico> listaMedicos) {this.listaMedicos = listaMedicos;}
    
    @Override
    public String toString() {
        return "Admin{" + "listaPacientes=" + listaPacientes + 
                ", listaMedicos=" + listaMedicos + 
                ", userName=" + userName + ", password=" + password + '}';
    }
    
    @Override
    public String getDataStringFormat(){
        return "A;" + this.cedula + ";" + this.nombres[0] + ";" + 
                this.nombres[1] + ";" + this.apellidos[0] + ";" + 
                this.apellidos[1] + ";" + this.userName + ";" + this.password;
    }
}
