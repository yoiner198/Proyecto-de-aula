package modelo.archivos;

import modelo.entidades.Cita;
import modelo.entidades.Medico;
import modelo.entidades.Paciente;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;

public class ArchivoCita  extends Archivo{
    
    private List<Cita> citas;
    
    public ArchivoCita(){
        this("citas.txt");
        this.citas = new ArrayList();
    }
    public ArchivoCita(String ruta){super(ruta);}
    
    public Cita cargarDatos(String info[]){
        
        String ref = info[1];
        Paciente paciente = (Paciente) VentanaPrincipal.archivoPaciente.buscar(info[2]);
        Medico medicoEncargado = (Medico) VentanaPrincipal.archivoMedico.buscar(info[3]);
        String motivoConsulta = info[4];
        
        return new Cita(ref, paciente, medicoEncargado, motivoConsulta); 
    }
    public void agregar(Cita cita){
        PrintWriter pw = null;
        try{
            this.wr = new FileWriter(archivo, true);
            pw = new PrintWriter(wr);
            
            if(cita == null){
                pw.print("");
            }else{
                pw.println(cita.getDataStringFormat());
            }
            
        }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al guardar los cambios","Error",
                JOptionPane.WARNING_MESSAGE);
                
        }finally{
            if(pw != null){
                pw.close();
            }
        }
    }
    public Cita buscar(String ref){
        Cita cita = null;
        
        try{
            this.rd = new Scanner(this.archivo);
            while(this.rd.hasNext()){
                String datos[] = this.rd.nextLine().split(";");
                Cita citaAux = this.cargarDatos(datos);
                
                if(citaAux.getRef().equals(ref)){
                    cita = citaAux;
                }
            }
            
        }catch (FileNotFoundException ae){
            JOptionPane.showMessageDialog(null,"No se pudo abrir el archivo en busqueda "
                    + "de la cita soilicitada","Error",
                JOptionPane.WARNING_MESSAGE);
            
        }finally{
            if(this.rd!=null)
                this.rd.close();
        }
        return cita;
    }
    public void eliminar(Cita cita){
        ArchivoCita archivoTmp = new ArchivoCita("citas.tpm");
        int i = 0;
        
        try{
            
            this.rd = new Scanner(this.archivo);
            while(this.rd.hasNext()){
                
                String datos[] = this.rd.nextLine().split(";");
                Cita CAux = this.cargarDatos(datos);
                
                if(!CAux.getRef().equalsIgnoreCase(cita.getRef())){
                    archivoTmp.agregar(CAux);
                    i++;
                }
            }
            if(i==0){
                archivoTmp.agregar(null);   
            }
            this.renombrarArchivo(archivoTmp.archivo);
            this.rd.close();
            
        }catch (FileNotFoundException ae){
            
            
        }catch (IOException e){
            
            JOptionPane.showMessageDialog(null,"Error al eliminar en el archivo","Error",
                JOptionPane.WARNING_MESSAGE);
            
        }finally{
            if(this.rd!=null)
                this.rd.close();
        }
    }
    public void cargarCitas(){
        
        try{
                this.rd = new Scanner(this.archivo);
                
                while(this.rd.hasNext()){
                    String datos[] = this.rd.nextLine().split(";");
                    Cita citaAux = this.cargarDatos(datos);
                    citas.add(citaAux);
                }

            }catch (FileNotFoundException ae){
                JOptionPane.showMessageDialog(null,"No se pudo abrir para "
                        + "listar los usuarios","Error",
                    JOptionPane.WARNING_MESSAGE);

            }finally{
                if(this.rd!=null)
                    this.rd.close();
            }
    }
    public List<Cita> getCitas() {return citas;}
}
