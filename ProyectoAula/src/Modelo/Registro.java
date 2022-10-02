package Modelo;


public class Registro { //  esta clase obtiene los datos de registro de nuevos usuarios y de contratacion de nuevo personal
    public String admin;
    public Usuario persona;
    public Personal contratar;

    public Registro(String admin, Usuario persona, Personal contratar) {
        this.admin = admin;
        this.persona = persona;
        this.contratar = contratar;
    }

    public String getAdmin() {
        return admin;
    }

    public Usuario getPersona() {
        return persona;
    }

    public Personal getContratar() {
        return contratar;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setPersona(Usuario persona) {
        this.persona = persona;
    }

    public void setContratar(Personal contratar) {
        this.contratar = contratar;
    }
    
    
    
}