package modelo.entidades;

public abstract class Persona implements IMetodo{
    
    protected String cedula;
    protected String nombres[], apellidos[];
    protected String userName, password;

    public Persona(){}
    
    public Persona(String cedula, String[] nombres, 
            String[] apellidos) {
        
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Persona(String cedula, String[] nombres, String[] apellidos, String userName, String password) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.userName = userName;
        this.password = password;
    }
    
    public String getCedula() {return cedula;}
    public void setCedula(String cedula) {this.cedula = cedula;}

    public String[] getNombres() {return nombres;}
    public void setNombres(String[] nombres) {this.nombres = nombres;}

    public String[] getApellidos() {return apellidos;}
    public void setApellidos(String[] apellidos) {this.apellidos = apellidos;}
    
    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", primer nombre=" + nombres[0] +
                " , segundo nombre=" + nombres[1] + ", primer apellido=" + apellidos[0] + 
                ", segundo apellido=" + apellidos[1] + '}';
    }
    
    @Override
    public abstract String getDataStringFormat();
}
