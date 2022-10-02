package Modelo;

public class Inisesion { 
    //      Esta clase obtiene un usuario y contraseña que luego seran usados para compararse 
    //      con los datos que estan guardados en el registro de usuarios y asi inciar sesion.
    
    private String camUsuario;
    private double campPin;

    public Inisesion(String camUsuario, double campPin) {
        this.camUsuario = camUsuario;
        this.campPin = campPin;
    }

    public String getCamUsuario() {
        return camUsuario;
    }

    public double getCampPin() {
        return campPin;
    }

    public void setCamUsuario(String camUsuario) {
        this.camUsuario = camUsuario;
    }

    public void setCampPin(double campPin) {
        this.campPin = campPin;
    }
    
    
}
