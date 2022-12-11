package modelo.archivos;

import modelo.entidades.Cita;
import modelo.entidades.Medico;
import modelo.entidades.Paciente;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;

public class ArchivoMedico extends ArchivoPersona {

    private List<Medico> medicos;

    public ArchivoMedico() {

        this("medicos.txt");
        this.medicos = new ArrayList();
    }

    public ArchivoMedico(String ruta) {
        super(ruta);
    }

    @Override
    public Medico cargarDatos(String[] info) {

        String nombres[] = new String[2];
        String apellidos[] = new String[2];
        List<Paciente> pacientes = new ArrayList();
        List<Cita> citas = new ArrayList();

        String cedula = info[1];
        nombres[0] = info[2];
        nombres[1] = info[3];
        apellidos[0] = info[4];
        apellidos[1] = info[5];

        for (Paciente paciente : VentanaPrincipal.archivoPaciente.getPacientes()) {
            if (paciente.getMedico() != null && paciente.getMedico().getCedula().equals(cedula))
               pacientes.add(paciente);
        }

        for (Cita cita : VentanaPrincipal.archivoCita.getCitas()) {
            if (cita.getMedicoEncargado().getCedula().equals(cedula))
                citas.add(cita);
        }
        boolean disponibilidad = Boolean.parseBoolean(info[8]);
        
        return new Medico(cedula, nombres, apellidos,
                pacientes, citas, disponibilidad);
    }

    public void cargarMedicos() {

        try {
            this.rd = new Scanner(this.archivo);

            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Medico mAux = this.cargarDatos(datos);
                medicos.add(mAux);
            }

        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo para "
                    + "listar los medicos", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}
