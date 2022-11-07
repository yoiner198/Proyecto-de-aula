package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Acita { //esta clase define las variables necesarias para luego usarlas en el proceso de apartar citas
    
    private String motivoConsula;
    private String tipoConsulta;
    Scanner si = new Scanner(System.in);

    public Acita() {
    }
    

    public Acita(String motivoConsula, String tipoConsulta) {
        this.motivoConsula = motivoConsula;
        this.tipoConsulta = tipoConsulta;
    }

    public String getMotivoConsula() {
        return motivoConsula;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setMotivoConsula() {
        this.motivoConsula = motivoConsula;
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
       String especialidad;
       String medico="a";
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
               especialidad = "Medicina general";
               break;
           }
           case 2:{
               especialidad = "Psicologia";
               break;
           }
           case 3:{
               especialidad = "Pediatria";
               break;
           }
           case 4:{
               especialidad = "Odontologia";               
               break;   
           }
           case 5:{
               especialidad = "Psiquiatria";
               break;
           }
           case 6:{
               especialidad = "Ginecologia";
               break;
           }        
       };
       
       System.out.println("Elija el medico por el que desea ser atendido: ");
       switch(op){
           case 1:{
               eM(op2, "a","b","c",medico);
               break;
           }
           case 2:{
               eM(op2, "d","e","f",medico);
               break;
           }
           case 3:{
               eM(op2, "g","h","i",medico);
               break;
           }
           case 4:{
               eM(op2, "j","k","l",medico);
               break;
           }
           case 5:{
               eM(op2, "m","n","as",medico);
               break;
           }
           case 6:{
               eM(op2, "o","p","q",medico);
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
    
    public void apartarCita(){
        fCita();
        System.out.println("Ingrese el motivo de su cita: ");
        this.motivoConsula = si.nextLine();
        menuACita();
        
    }
}
