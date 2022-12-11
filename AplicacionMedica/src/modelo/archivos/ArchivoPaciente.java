package modelo.archivos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.entidades.Cita;
import modelo.entidades.Medico;
import modelo.entidades.Paciente;
import vista.VentanaPrincipal;

public class ArchivoPaciente extends ArchivoPersona {

    private List<Paciente> pacientes;

    public ArchivoPaciente() {
        this("pacientes.txt");
        this.pacientes = new ArrayList();
    }

    public ArchivoPaciente(String ruta) {
        super(ruta);
    }

    @Override
    public Paciente cargarDatos(String[] info) {

        String nombres[] = new String[2];
        String apellidos[] = new String[2];

        String cedula = info[1];
        nombres[0] = info[2];
        nombres[1] = info[3];
        apellidos[0] = info[4];
        apellidos[1] = info[5];

        Cita cita = null;
        if (!info[6].equals("null")) {
            for(Cita ct : VentanaPrincipal.archivoCita.getCitas()){
                if(ct.getRef().equals(info[6])){
                    cita = ct;
                    break;
                }
            }
        }

        Medico medico = null;
        if (!info[7].equals("null")) {
            medico = (Medico) VentanaPrincipal.archivoMedico.buscar(info[7]);
        }
        String userName = info[8];
        String password = info[9];

        return new Paciente(cedula, nombres, apellidos,
                cita, medico, userName, password);
    }

    public void cargarPacientes() {
        try {
            this.rd = new Scanner(this.archivo);

            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Paciente pAux = this.cargarDatos(datos);
                pacientes.add(pAux);
            }

        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo para "
                    + "listar a los pacientes", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
    }
    
    public List<Paciente> getPacientes() {return pacientes;}
}
