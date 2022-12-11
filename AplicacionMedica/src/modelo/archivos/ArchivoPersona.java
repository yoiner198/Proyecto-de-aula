package modelo.archivos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.entidades.Persona;

public abstract class ArchivoPersona extends Archivo {

    public ArchivoPersona(String ruta) {
        super(ruta);
    }

    //Metodo abstracto que deben implementar las otras clases
    public abstract Persona cargarDatos(String[] info);

    //Metodos que son funcionales para las otras clases
    public void actualizar(Persona persona) {
        eliminar(persona);
        agregar(persona);
    }
    public Persona buscar(String cedula) {
        Persona persona = null;

        try {
            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Persona pAux = this.cargarDatos(datos);

                if (pAux.getCedula().equals(cedula)) {
                    persona = pAux;
                    return persona;
                }
            }

        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo en busqueda "
                    + "de la persona solicitada", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
        return persona;
    }
    public Persona buscarUsuario(String usuario) {
        Persona persona = null;

        try {
            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Persona pAux = this.cargarDatos(datos);

                if (pAux.getUserName().equals(usuario)) {
                    persona = pAux;
                    return persona;
                }
            }

        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo en busqueda "
                    + "del paciente solicitado", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
        return persona;
    }
    public boolean verificarEntrada(String user, String password) {
        
        boolean registrado = false;
        try {
            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Persona pAux = this.cargarDatos(datos);

                if (pAux.getUserName().equals(user) && pAux.getPassword().equals(password)) {
                    registrado = true;
                    break;
                }
            }

        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo en busqueda "
                    + "del paciente solicitado", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
        return registrado;
    }
    public void agregar(Persona persona) {

        PrintWriter pw = null;
        try {
            this.wr = new FileWriter(archivo, true);
            pw = new PrintWriter(wr);

            if (persona == null) {
                pw.print("");
            } else {
                pw.println(persona.getDataStringFormat());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los cambios", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
    public void eliminar(Persona persona) {
        ArchivoPaciente archivoTmp = new ArchivoPaciente("pacientes.tpm");
        int i = 0;

        try {

            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {

                String datos[] = this.rd.nextLine().split(";");
                Persona pAux = this.cargarDatos(datos);

                if (!pAux.getCedula().equalsIgnoreCase(persona.getCedula())) {
                    archivoTmp.agregar(pAux);
                    i++;
                }
            }
            if (i == 0) {
                archivoTmp.agregar(null);
            }
            this.renombrarArchivo(archivoTmp.archivo);
            this.rd.close();

        } catch (FileNotFoundException ae) {

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar en el archivo", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
    }
}
