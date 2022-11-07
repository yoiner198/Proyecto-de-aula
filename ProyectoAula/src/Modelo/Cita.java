package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Cita {
    private String motivoConsulta;
    private String tipoConsulta;
    private String medico;
    private int codigo;
    Scanner si = new Scanner(System.in);

    public Cita() {
    }

    public Cita(String motivoConsulta, String tipoConsulta, int codigo, String medico) {
        this.motivoConsulta = motivoConsulta;
        this.tipoConsulta = tipoConsulta;
        this.codigo = codigo;
        this.medico = medico;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
    
    
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setMotivoConsulta() {
        this.motivoConsulta = motivoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    public void eM(int oo, String mA, String mB, String mC, String medic){
        System.out.println("1. "+mA
                + "\n       2. "+mB
                + "\n       3. "+mC);
        oo = si.nextInt();
               
        switch(oo){
            case 1:{
                medic = mA;
                break;
            }
            case 2:{
                medic = mB;
                break;
            }
            case 3:{
                medic = mC;
                break;
            }
        }
    }
    public void menuACita(){
       int op, op2=0;
       
       System.out.println("Elija la especialidad en la que desea ser atendido: ");
       do{
            System.out.println("1. Medicina general\n"
                             + "2. Psicologia\n"
                             + "3. Pediatria\n"
                             + "4. Odontologia\n"
                             + "5. Psiquiatria\n"
                             + "6. Ginecologia");
             op = si.nextInt();
       }while(op<0 && op>6);
       switch(op){
           case 1:{
               this.tipoConsulta = "Medicina general";
               break;
           }
           case 2:{
               this.tipoConsulta = "Psicologia";
               break;
           }
           case 3:{
               this.tipoConsulta = "Pediatria";
               break;
           }
           case 4:{
               this.tipoConsulta = "Odontologia";               
               break;   
           }
           case 5:{
               this.tipoConsulta = "Psiquiatria";
               break;
           }
           case 6:{
               this.tipoConsulta = "Ginecologia";
               break;
           }        
       };
       
       System.out.println("Elija el medico por el que desea ser atendido: ");
       switch(op){
           case 1:{
               eM(op2, "a","b","c",this.medico);
               break;
           }
           case 2:{
               eM(op2, "d","e","f",this.medico);
               break;
           }
           case 3:{
               eM(op2, "g","h","i",this.medico);
               break;
           }
           case 4:{
               eM(op2, "j","k","l",this.medico);
               break;
           }
           case 5:{
               eM(op2, "m","n","as",this.medico);
               break;
           }
           case 6:{
               eM(op2, "o","p","q",this.medico);
               break;
           }
           
       }
   }
    
    public double fCita(){
       long fechah;
       Date fecha = new Date();
       fechah = fecha.getTime()+604800000;
       
       SimpleDateFormat fech = new SimpleDateFormat();
       System.out.println(fecha);
       return 0;
    }
    
    public int genCodigo(){
        Random r = new Random();
        int a = r.nextInt(999)+100;
        return a;
    }
    
    public void apartarCita(){
        System.out.println("Ingrese el motivo de su cita: ");
        this.motivoConsulta = si.nextLine();
        menuACita();
        this.codigo = genCodigo();
        System.out.println("Su codigo de cita es: "+this.codigo);
    }
    public void modCita(){
        int opcion=0;
        do{
            System.out.println("¿Qué desea modificar?\n"
                    +           "1. Modificar Motivo de cita."
                    +           "2. Modificar Especialidad en la que desea ser atendido.");
            
            opcion = si.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese el motivo de su cita: ");
                    this.motivoConsulta = si.nextLine();
                    break;
                }
                case 2:{
                    menuACita();
                    break;
                }      
            }
            
        }while(opcion<0 && opcion>3);
    }
   public void consultarCita(){
       int verCodigo=0;
       System.out.println("     MENUE DE CONSULTA DE CITAS      +"
               +          "\nIngrese su codigo de cita: ");
       verCodigo = si.nextInt();
       if(verCodigo == this.codigo){
           System.out.println("     INFORMACION DE LA CITA      "
                   +            "\nMotivo de consulta: "+this.motivoConsulta+
                                "\nEspecialidad: "+this.tipoConsulta+
                                "\nMedico: "+this.medico);
       }
       else{
           System.out.println("Codigo invalido");
       }
   }
}
