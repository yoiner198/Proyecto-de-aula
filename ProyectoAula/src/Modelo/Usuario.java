package Modelo;

public class Usuario { // En esta clase se piden todos los datos necesarios para que se registren los nuevos usaurios a la eps
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    private String tSangre;
    private double documento;
    private String usuario1;
    private double pin1;

    public Usuario(String nombre, String apellido, String genero, int edad, String tSangre, double documento, String usuario1, double pin1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.tSangre = tSangre;
        this.documento = documento;
        this.usuario1 = usuario1;
        this.pin1 = pin1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String gettSangre() {
        return tSangre;
    }

    public double getDocumento() {
        return documento;
    }

    public String getUsuario1() {
        return usuario1;
    }

    public double getPin1() {
        return pin1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void settSangre(String tSangre) {
        this.tSangre = tSangre;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public void setPin1(double pin1) {
        this.pin1 = pin1;
    }

    
    
}