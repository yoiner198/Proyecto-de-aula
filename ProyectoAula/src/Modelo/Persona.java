package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    Scanner a = new Scanner(System.in); 
    protected String nombre;
    protected String apellido;
    protected String genero;
    protected int edad;
    protected int documento;
    protected String usuario;
    protected int pin;
    protected ArrayList s;
    
    public Persona(){
        
    }

    public Persona(String nombre, String apellido, String genero, int edad, int documento, String usuario, int pin, ArrayList s) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.documento = documento;
        this.usuario = usuario;
        this.pin = pin;
        this.s = s;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public ArrayList Registrar(){
        
        System.out.println("      REGISTRO DE USUARIO COMUN     "+"\nINGRESE LOS SIGUINETES DATOS: ");
        System.out.println("Nombre: "); this.nombre = a.nextLine();
        System.out.println("Apellido: "); this.apellido = a.nextLine();
        System.out.println("Documento: "); this.documento = a.nextInt();
        System.out.println("Edad: "); this.edad = a.nextInt();
        System.out.println("Cree su usuario y contraseña para ingresar");
        System.out.println("Usuario: "); this.usuario = a.nextLine();this.usuario = a.nextLine();
        System.out.println("PIN: (solo numeros enteros)"); this.pin = a.nextInt();
        System.out.println("Su usuario es: "+this.usuario);
        System.out.println("Su pin es: "+this.pin);
        
        return this.s;
    }

    
}
