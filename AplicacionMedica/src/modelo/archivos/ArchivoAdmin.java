package modelo.archivos;

import modelo.entidades.Admin;
import modelo.entidades.Medico;
import modelo.entidades.Paciente;
import java.util.ArrayList;
import java.util.List;
import vista.VentanaPrincipal;

public class ArchivoAdmin extends ArchivoPersona{
    
    public ArchivoAdmin(){this("admin.txt");}
    public ArchivoAdmin(String ruta){super(ruta);}
    
    @Override
    public Admin cargarDatos(String[] info){
        
        String nombres[] = new String[2];
        String apellidos[] = new String[2];
        List<Paciente> pacientes = new ArrayList();
        List<Medico> medicos = new ArrayList();
        
        String cedula = info[1];
        nombres[0] = info[2];
        nombres[1] = info[3];
        apellidos[0] = info[4];
        apellidos[1] = info[5];
        
        for(Paciente paciente : VentanaPrincipal.archivoPaciente.getPacientes()){
            pacientes.add(paciente);
        }
        for(Medico medico : VentanaPrincipal.archivoMedico.getMedicos()){
            medicos.add(medico);
        }
        
        String username = info[6];
        String password = info[7];
        
        return new Admin( cedula, nombres, apellidos, username, password, pacientes, medicos);
    }
}
