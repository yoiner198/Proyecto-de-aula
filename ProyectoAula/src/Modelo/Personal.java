package Modelo;

public class Personal extends Persona{ // En esta clase se obtienen los datos que son necesarios para contratar nuevo personal a la eps

    private String profesion;

    public Personal(String profesion) {
        this.profesion = "Medico General";
    }

    public Personal(String profesion, String nombre, String apellido, String genero, int edad, int documento, String usuario, int pin) {
        super(nombre, apellido, genero, edad, documento, usuario, pin);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
}