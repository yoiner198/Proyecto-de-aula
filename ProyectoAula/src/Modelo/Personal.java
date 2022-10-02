package Modelo;

public class Personal { // En esta clase se obtienen los datos que son necesarios para contratar nuevo personal a la eps
    private String nombreCompl;
    private String profesion;
    private String usuario;
    private double pin;

    public Personal(String nombreCompl, String profesion, String usuario, double pin) {
        this.nombreCompl = this.nombreCompl;
        this.profesion = profesion;
        this.usuario = usuario;
        this.pin = pin;
    }

    public String getNombreCompl() {
        return nombreCompl;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getUsuario() {
        return usuario;
    }

    public double getpin() {
        return pin;
    }

    public void setNombreCompl(String nombreCompl) {
        this.nombreCompl = nombreCompl;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(double pin) {
        this.pin = pin;
    }
    
    
    


    
}
