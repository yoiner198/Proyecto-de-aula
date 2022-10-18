package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Persona{ // En esta clase se piden todos los datos necesarios para que se registren los nuevos usaurios a la eps
    Scanner a = new Scanner(System.in); 
    private String tSangre;
    private int i;
    private int nUsuarios=1;
    private ArrayList<ArrayList> usuarios = new ArrayList<>();

    
    

    public Usuario() {
        
    }

    public Usuario(String nombre, String apellido, String genero, int edad, int documento, String usuario, int pin, ArrayList s) {
        super(nombre, apellido, genero, edad, documento, usuario, pin, s);
        this.tSangre = tSangre;
    }
    public String getTSangre() {
        return tSangre;
    }

    public void setTSangre(String tSangre) {
        this.tSangre = tSangre;
    }

    @Override
    public ArrayList Registrar() {
        for(i=nUsuarios;i<=nUsuarios;i++){
            usuarios.add(super.Registrar());

        }
        nUsuarios++;
        return super.s;
    }

    

}